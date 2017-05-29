package tests;

import org.testng.annotations.Factory;

public class TestFactory {

    @Factory
    public Object[] createInstance(){
        String urlExp1 = "http://www.vsetv.com/export/megogo/epg/3.xml";
        String urlAct1 = "http://epg.megogo.net/channel/now?external_id=295";
        String urlExp2 = "http://www.vsetv.com/export/megogo/epg/4.xml";
        String urlAct2 = "http://epg.megogo.net/channel/now?external_id=4";
        return new TVShowsTest[]{
                new TVShowsTest(urlExp1, urlAct1),
                new TVShowsTest(urlExp2, urlAct2),
        };
    }
}