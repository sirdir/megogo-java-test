package pojo.current;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Genre {

    private int id;

    @JsonProperty(value = "external_id")
    private int externalId;

    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExternalId() {
        return externalId;
    }

    public void setExternalId(int externalId) {
        this.externalId = externalId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
