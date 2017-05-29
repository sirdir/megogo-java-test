package pojo.shedule;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class Title {

    @JacksonXmlProperty(isAttribute = true)
    private String lang;

    @JacksonXmlText
    private String title;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getValue() {
        return title;
    }

    public void setValue(String title) {
        this.title = title;
    }
}