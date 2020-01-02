
package app.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "consolidated_weather",
    "time",
    "parent",
    "title",
    "location_type",
    "woeid",
    "latt_long",
    "timezone"
})
public class CityFiveDaysForecast {

    @JsonProperty("consolidated_weather")
    private List<FiveDaysForecast> consolidatedForecast;
    @JsonProperty("time")
    private String time;
    @JsonProperty("title")
    private String title;
    @JsonProperty("location_type")
    private String locationType;
    @JsonProperty("woeid")
    private Long woeid;
    @JsonProperty("timezone")
    private String timezone;

    @JsonProperty("consolidated_weather")
    public List<FiveDaysForecast> getConsolidatedForecast() {
        return consolidatedForecast;
    }

    @JsonProperty("consolidated_weather")
    public void setConsolidatedForecast(List<FiveDaysForecast> consolidatedForecast) {
        this.consolidatedForecast = consolidatedForecast;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("location_type")
    public String getLocationType() {
        return locationType;
    }

    @JsonProperty("location_type")
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    @JsonProperty("woeid")
    public Long getWoeid() {
        return woeid;
    }

    @JsonProperty("woeid")
    public void setWoeid(Long woeid) {
        this.woeid = woeid;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }


}
