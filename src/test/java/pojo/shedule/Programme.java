package pojo.shedule;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class Programme {

    @JacksonXmlProperty(isAttribute = true)
    private String start;

    @JacksonXmlProperty(isAttribute = true)
    private String stop;

    @JacksonXmlProperty(isAttribute = true)
    private int channel;

    @JacksonXmlProperty(isAttribute = true)
    private int genre_id;

    @JacksonXmlProperty(isAttribute = true)
    private int programme_id;

    @JacksonXmlProperty(isAttribute = true)
    private int category_id;

    @JacksonXmlProperty(localName = "id")
    private long id;

    @JacksonXmlProperty(localName = "date")
    private String date;

    @JacksonXmlProperty(localName = "title")
    private Title title;

    @JacksonXmlProperty(localName = "category")
    private Category category;

    @JacksonXmlProperty(localName = "genre")
    private Genre genre;

    @JacksonXmlProperty(localName = "desc")
    private Desc desc;

    @JacksonXmlProperty(localName = "longdesc")
    private LongDesc longdesc;

    @JacksonXmlProperty(localName = "production_year")
    private String productionYear;

    @JacksonXmlProperty(localName = "megogo_id")
    private int megogoId;

    @JacksonXmlProperty(localName = "kinopoisk_id")
    private int kinopoiskId;

    @JacksonXmlProperty(localName = "season-num")
    private String seasonNum;

    @JacksonXmlProperty(localName = "episode-num")
    private String episodeNum;

    @JacksonXmlProperty(localName = "parental")
    private String parental;

    @JacksonXmlProperty(localName = "image")
    private String image;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Desc getDesc() {
        return desc;
    }

    public void setDesc(Desc desc) {
        this.desc = desc;
    }

    public LongDesc getLongdesc() {
        return longdesc;
    }

    public void setLongdesc(LongDesc longdesc) {
        this.longdesc = longdesc;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public int getMegogoId() {
        return megogoId;
    }

    public void setMegogoId(int megogoId) {
        this.megogoId = megogoId;
    }

    public int getKinopoiskId() {
        return kinopoiskId;
    }

    public void setKinopoiskId(int kinopoiskId) {
        this.kinopoiskId = kinopoiskId;
    }

    public String getSeasonNum() {
        return seasonNum;
    }

    public void setSeasonNum(String seasonNum) {
        this.seasonNum = seasonNum;
    }

    public String getEpisodeNum() {
        return episodeNum;
    }

    public void setEpisodeNum(String episodeNum) {
        this.episodeNum = episodeNum;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getStop() {
        return stop;
    }

    public void setStop(String stop) {
        this.stop = stop;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getGenreId() {
        return genre_id;
    }

    public void setGenreId(int genre_id) {
        this.genre_id = genre_id;
    }

    public int getProgrammeId() {
        return programme_id;
    }

    public void setProgrammeId(int programme_id) {
        this.programme_id = programme_id;
    }

    public int getCategoryId() {
        return category_id;
    }

    public void setCategoryId(int category_id) {
        this.category_id = category_id;
    }

    public String getParental() {
        return parental;
    }

    public void setParental(String parental) {
        this.parental = parental;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
