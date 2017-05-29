package pojo.current;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class Programs {

    @JsonProperty(value = "external_id")
    private int externalId;

    @JsonProperty(value = "object_id")
    private int objectId;

    private String year;

    private String title;

    private String description;

    @JsonProperty(value = "schedule_string")
    private String scheduleString;

    private Genre genre;

    private Category category;

    private Pictures pictures;

    @JsonProperty(value = "virtual_object_id")
    private String virtualObjectId;

    private LocalDateTime start;

    @JsonProperty(value = "start_timestamp")
    private int startTimestamp;

    private LocalDateTime end;

    @JsonProperty(value = "end_timestamp")
    private int endTimestamp;

    public int getExternalId() {
        return externalId;
    }

    public void setExternalId(int externalId) {
        this.externalId = externalId;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getScheduleString() {
        return scheduleString;
    }

    public void setScheduleString(String scheduleString) {
        this.scheduleString = scheduleString;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Pictures getPictures() {
        return pictures;
    }

    public void setPictures(Pictures pictures) {
        this.pictures = pictures;
    }

    public String getVirtualObjectId() {
        return virtualObjectId;
    }

    public void setVirtualObjectId(String virtualObjectId) {
        this.virtualObjectId = virtualObjectId;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public int getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(int startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public int getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(int endTimestamp) {
        this.endTimestamp = endTimestamp;
    }
}