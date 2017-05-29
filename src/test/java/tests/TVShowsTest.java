package tests;

import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pojo.shedule.Programme;
import pojo.shedule.Tv;

import java.io.*;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.*;

/**
 * Created by sirdir on 29.05.17.
 */
public class TVShowsTest {

    private String urlExp = "http://www.vsetv.com/export/megogo/epg/3.xml";
    private String urlAct = "http://epg.megogo.net/channel/now?external_id=295";

    TVShowsTest(String urlExp, String urlAct){
        this.urlExp = urlExp;
        this.urlAct = urlAct;
    }


    @Test
    public void testRequest(){
        String xmlResponse = get(urlExp).getBody().asString();
        String jsonResponse = get(urlAct).getBody().asString();
        JacksonXmlModule module = new JacksonXmlModule();
        module.setDefaultUseWrapper(false);
        XmlMapper xmlMapper = new XmlMapper(module);
        Tv tv = null;
        try {
            tv = xmlMapper.readValue(xmlResponse, Tv.class);
        } catch (IOException e) {
            Assert.fail("cant parse xml to POJO", e);
        }
        List<Programme> programmes = Arrays.asList(tv.getProgramme());
        int index = -1;
        for (int i = 0; i < programmes.size(); i++){
            String str = programmes.get(i).getStart();
            if (str != null && str.equals("2017-05-29 17:10:00")){
                index = i;
                break;
            }
        }
        Assert.assertNotEquals(index, -1, "no such node in expected xml");
        String expStart = "May 29, 2017 6:45:00 AM";
        String expStop = "May 29, 2017 7:00:00 AM";
        String expTitle = "\\\"Завтрак с 1+1\\\". Информационно-развлекательная программа.";
        String expGenre = "информация (комплексная)";
        String expProdYear = "2012";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(programmes.get(index).getTitle().getValue(), expTitle, "1");
        softAssert.assertEquals(programmes.get(index).getStart(), expStart, "2");
        softAssert.assertEquals(programmes.get(index).getStop(), expStop, "3");
        softAssert.assertEquals(programmes.get(index).getGenre().getValue(), expGenre, "4");
        softAssert.assertEquals(programmes.get(index).getProductionYear(),expProdYear, "5");
        softAssert.assertAll();
    }
}