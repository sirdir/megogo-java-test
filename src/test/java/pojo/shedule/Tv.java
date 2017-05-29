package pojo.shedule;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "tv")
public class Tv {

    @JacksonXmlProperty(localName = "source-info-url")
    private String sourceInfoUrl;

    @JacksonXmlProperty(localName = "source-info-name")
    private String sourceInfoName;


    @JacksonXmlProperty(localName = "generator-info-url")
    private String generatorInfoUrl;

    @JacksonXmlProperty(localName = "programme")
    private Programme[] programme;

    @JacksonXmlProperty(localName = "channel")
    private Channel channel;

    public Programme[] getProgramme() {
        return programme;
    }

    public void setProgramme(Programme[] programme) {
        this.programme = programme;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public String getSourceInfoUrl() {
        return sourceInfoUrl;
    }

    public void setSourceInfoUrl(String sourceInfoUrl) {
        this.sourceInfoUrl = sourceInfoUrl;
    }

    public String getSourceInfoName() {
        return sourceInfoName;
    }

    public void setSourceInfoName(String sourceInfoName) {
        this.sourceInfoName = sourceInfoName;
    }

    public String getGeneratorInfoUrl() {
        return generatorInfoUrl;
    }

    public void setGeneratorInfoUrl(String generatorInfoUrl) {
        this.generatorInfoUrl = generatorInfoUrl;
    }
}
