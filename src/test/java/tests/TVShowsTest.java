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

    TVShowsTest(String urlExp, String urlAct){
        this.urlExp = urlExp;
        this.urlAct = urlAct;
    }


    @Test
    public void testRequest() throws IOException {
        String xmlResponse = get(urlExp).getBody().asString();
        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        JavaTimeModule moduleTime1 = new JavaTimeModule();
        LocalDateTimeDeserializer localDateTimeDeserializer =
                new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        moduleTime1.addDeserializer(LocalDateTime.class, localDateTimeDeserializer);
        module.addDeserializer(LocalDateTime.class, localDateTimeDeserializer);
        XmlMapper xmlMapper = new XmlMapper(module);
        xmlMapper.registerModule(moduleTime1);
//        xmlMapper.disable(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS);
        Tv tv = xmlMapper.readValue(xmlResponse, Tv.class);

        String jsonResponse = get(urlAct).getBody().asString();
        JavaTimeModule moduleTime2 = new JavaTimeModule();
        LocalDateTimeDeserializer localDateTimeDeserializer2 =
                new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern("MMM dd, yyyy h[h]:mm:ss a"));
        moduleTime2.addDeserializer(LocalDateTime.class, localDateTimeDeserializer2);

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(moduleTime2);

        Json json = mapper.readValue(jsonResponse, Json.class);

        List<Programme> programmes = Arrays.asList(tv.getProgramme());
        int index = -1;
        for (int i = 0; i < programmes.size(); i++){
            LocalDateTime str = programmes.get(i).getStart();
            if (str != null && str.equals(json.getData().get(0).getPrograms().get(0).getStart())){
                index = i;
                break;
            }
        }
        Assert.assertNotEquals(index, -1, "no such node in expected xml");

        LocalDateTime actStart = json.getData().get(0).getPrograms().get(0).getStart();
        LocalDateTime actStop = json.getData().get(0).getPrograms().get(0).getEnd();
        String actTitle = json.getData().get(0).getPrograms().get(0).getTitle();
        String actGenre = json.getData().get(0).getPrograms().get(0).getGenre().getTitle();
        String actProdYear = json.getData().get(0).getPrograms().get(0).getYear();

        LocalDateTime expStart = programmes.get(index).getStart();
        LocalDateTime expStop = programmes.get(index).getStop();
        String expTitle = programmes.get(index).getTitle().getValue();
        String expGenre = programmes.get(index).getGenre().getValue();
        String expProdYear = programmes.get(index).getProductionYear();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actStart, expStart, actStart.toString());
        softAssert.assertEquals(actStop, expStop, actStart.toString());
        softAssert.assertEquals(actTitle, expTitle, "title mismatch for program starting at = " + actStart.toString());
        softAssert.assertEquals(actGenre, expGenre, "genre mismatch for program starting at = " + actStart.toString());
        softAssert.assertEquals(actProdYear, expProdYear, "prodYear mismatch for program starting at = " + actStart.toString());
        softAssert.assertAll();
    }
}