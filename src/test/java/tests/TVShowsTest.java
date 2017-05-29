package tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pojo.current.Json;
import pojo.shedule.Programme;
import pojo.shedule.Tv;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.get;

public class TVShowsTest {

    private String urlExp = "http://www.vsetv.com/export/megogo/epg/3.xml";
    private String urlAct = "http://epg.megogo.net/channel/now?external_id=295";
    private XmlMapper xmlMapper;
    private ObjectMapper jsonMapper;

    TVShowsTest(String urlExp, String urlAct){
        this.urlExp = urlExp;
        this.urlAct = urlAct;

        JacksonXmlModule xmlModule = new JacksonXmlModule();
        xmlModule.setDefaultUseWrapper(false);
        JavaTimeModule moduleTime1 = new JavaTimeModule();
        LocalDateTimeDeserializer localDateTimeDeserializer =
                new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        moduleTime1.addDeserializer(LocalDateTime.class, localDateTimeDeserializer);
        xmlModule.addDeserializer(LocalDateTime.class, localDateTimeDeserializer);
        xmlMapper = new XmlMapper(xmlModule);
        xmlMapper.registerModule(moduleTime1);

        JavaTimeModule moduleTime2 = new JavaTimeModule();
        LocalDateTimeDeserializer localDateTimeDeserializer2 =
                new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern("MMM dd, yyyy h[h]:mm:ss a"));
        moduleTime2.addDeserializer(LocalDateTime.class, localDateTimeDeserializer2);

        jsonMapper = new ObjectMapper();
        jsonMapper.registerModule(moduleTime2);
    }

    private int indexOfMatchingStartNode(List<Programme> programmes, LocalDateTime ldtJson){
        for (int i = 0; i < programmes.size(); i++) {
            LocalDateTime ldtXml = programmes.get(i).getStart();
            if (ldtXml.equals(ldtJson)) {
                return i;
            }
        }
        Assert.fail("no such node in xml with @start= " + ldtJson);
        return -1;
    }


    @Test
    public void testRequest() throws IOException {
        String xmlResponse = get(urlExp).getBody().asString();
        String jsonResponse = get(urlAct).getBody().asString();

        Tv tv = xmlMapper.readValue(xmlResponse, Tv.class);
        Json now = jsonMapper.readValue(jsonResponse, Json.class);

        List<Programme> programmes = Arrays.asList(tv.getProgramme());
        LocalDateTime ldtJson = now.getData().get(0).getPrograms().get(0).getStart();
        int index = indexOfMatchingStartNode(programmes, ldtJson);

        LocalDateTime expStart = programmes.get(index).getStart();
        LocalDateTime expStop = programmes.get(index).getStop();
        String expTitle = programmes.get(index).getTitle() != null
                ? programmes.get(index).getTitle().getValue()
                : null;
        String expGenre = programmes.get(index).getGenre() != null
                ? programmes.get(index).getGenre().getValue()
                : null;
        String expProdYear = programmes.get(index).getProductionYear();

        LocalDateTime actStart = now.getData().get(0).getPrograms().get(0).getStart();
        LocalDateTime actStop = now.getData().get(0).getPrograms().get(0).getEnd();
        String actTitle = now.getData().get(0).getPrograms().get(0).getTitle();
        String actGenre = now.getData().get(0).getPrograms().get(0).getGenre().getTitle();
        String actProdYear = now.getData().get(0).getPrograms().get(0).getYear();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actStart, expStart,"start time mismatch");
        softAssert.assertEquals(actStop, expStop,"end time mismatch");
        softAssert.assertEquals(actTitle, expTitle,
                "title mismatch for program starting at = " + actStart.toString());
        softAssert.assertEquals(actGenre, expGenre,
                "genre mismatch for program starting at = " + actStart.toString());
        softAssert.assertEquals(actProdYear, expProdYear,
                "prodYear mismatch for program starting at = " + actStart.toString());
        softAssert.assertAll();
    }
}