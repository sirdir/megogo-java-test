package pojo.shedule;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Programme {

    @JacksonXmlProperty(isAttribute = true)
    private LocalDateTime start;

    @JacksonXmlProperty(isAttribute = true)
    private LocalDateTime stop;

    @JacksonXmlProperty(isAttribute = true)
    private int channel;

    @JacksonXmlProperty(localName = "genre_id")
    private int genreId;

    @JacksonXmlProperty(localName = "programme_id")
    private int programmeId;

    @JacksonXmlProperty(localName = "category_id")
    private int categoryId;

    private long id;

    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate date;

    private Title title;

    private Category category;

    private Genre genre;

    private Desc desc;

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
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

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getStop() {
        return stop;
    }

    public void setStop(LocalDateTime stop) {
        this.stop = stop;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genre_id) {
        this.genreId = genre_id;
    }

    public int getProgrammeId() {
        return programmeId;
    }

    public void setProgrammeId(int programme_id) {
        this.programmeId = programme_id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int category_id) {
        this.categoryId = category_id;
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
