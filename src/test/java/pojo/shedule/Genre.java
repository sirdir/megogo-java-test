package pojo.shedule;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class Genre {

    @JacksonXmlProperty(isAttribute = true)
    private String lang;

    @JacksonXmlText
    private String genre;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getValue() {
        return genre;
    }

    public void setValue(String genre) {
        this.genre = genre;
    }

}
