package pojo.current;

import java.util.List;

public class Data {

    private int id;

    private int external_id;

    private String title;

    private List<Programs> programs;

    private Pictures pictures;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExternal_id() {
        return external_id;
    }

    public void setExternal_id(int external_id) {
        this.external_id = external_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Programs> getPrograms() {
        return programs;
    }

    public void setPrograms(List<Programs> programs) {
        this.programs = programs;
    }

    public Pictures getPictures() {
        return pictures;
    }

    public void setPictures(Pictures pictures) {
        this.pictures = pictures;
    }
}