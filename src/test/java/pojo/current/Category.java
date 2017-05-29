package pojo.current;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {

    private int id;

    @JsonProperty(value = "external_id")
    private int externalId;

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getExternalId() {
        return externalId;
    }

    public void setExternalId(int externalId) {
        this.externalId = externalId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
