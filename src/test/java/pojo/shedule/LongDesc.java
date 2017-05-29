package pojo.shedule;

import com.fasterxml.jackson.dataformat.xml.annotation  .JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class LongDesc {

    @JacksonXmlProperty(isAttribute = true)
    private String lang;

    @JacksonXmlText
    private String longdesc;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getValue() {
        return longdesc;
    }

    public void setValue(String longdesc) {
        this.longdesc = longdesc;
    }
}
