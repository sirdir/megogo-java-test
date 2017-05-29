package pojo.current;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Pictures {
    public String original;

    @JsonProperty(value = "105x85")
    public String pict_105x85;

    @JsonProperty(value = "180x180")
    public String pict_180x180;

    @JsonProperty(value = "980x560")
    public String pict_980x560;

    @JsonProperty(value = "88x65")
    public String pict_88x65;

    @JsonProperty(value = "88x88")
    public String pict_88x88;

    @JsonProperty(value = "105x105")
    public String pict_105x105;

    @JsonProperty(value = "105x60")
    public String pict_105x60;

    @JsonProperty(value = "40x40")
    public String pict_40x40;

    @JsonProperty(value = "150x150")
    public String pict_150x150;

    @JsonProperty(value = "1600x520")
    public String pict_1600x520;

    @JsonProperty(value = "230x130")
    public String pict_230x130;
}
