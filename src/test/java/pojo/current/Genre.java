package pojo.current;

/**
 * Created by sirdir on 29.05.17.
 */
public class Genre {
    private int id;
    private int external_id;
    private String title;

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
}
