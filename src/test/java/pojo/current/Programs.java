package pojo.current;

import java.time.LocalDateTime;

public class Programs {
    private int external_id;
    private int object_id;
    private String year;
    private String title;
    private String description;
    private String schedule_string;
    private Genre genre;
    private Category category;
    private Pictures pictures;
    private String virtual_object_id;
    private LocalDateTime start;
    private int start_timestamp;
    private LocalDateTime end;
    private int end_timestamp;

    public int getExternal_id() {
        return external_id;
    }

    public void setExternal_id(int external_id) {
        this.external_id = external_id;
    }

    public int getObject_id() {
        return object_id;
    }

    public void setObject_id(int object_id) {
        this.object_id = object_id;
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

    public String getSchedule_string() {
        return schedule_string;
    }

    public void setSchedule_string(String schedule_string) {
        this.schedule_string = schedule_string;
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

    public String getVirtual_object_id() {
        return virtual_object_id;
    }

    public void setVirtual_object_id(String virtual_object_id) {
        this.virtual_object_id = virtual_object_id;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public int getStart_timestamp() {
        return start_timestamp;
    }

    public void setStart_timestamp(int start_timestamp) {
        this.start_timestamp = start_timestamp;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public int getEnd_timestamp() {
        return end_timestamp;
    }

    public void setEnd_timestamp(int end_timestamp) {
        this.end_timestamp = end_timestamp;
    }
}