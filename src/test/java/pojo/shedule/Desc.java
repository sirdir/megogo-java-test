package pojo.shedule;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class Desc {

    @JacksonXmlProperty(isAttribute = true)
    private String lang;

    @JacksonXmlText
    private String desc;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getValue() {
        return desc;
    }

    public void setValue(String desc) {
        this.desc = desc;
    }
}
