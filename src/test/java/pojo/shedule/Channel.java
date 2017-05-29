package pojo.shedule;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Channel {

    @JacksonXmlProperty(isAttribute = true)
    private int id;

    @JacksonXmlProperty(localName= "display-name")
    private String displayName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
