
package app.city3;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "latitude",
    "longitude",
    "timezone",
    "currently",
    "minutely",
    "hourly",
    "daily",
    "flags",
    "offset"
})
public class City {

    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("currently")
    private Currently currently;

    @JsonProperty("daily")
    private Daily daily;

    @JsonProperty("offset")
    private Integer offset;
    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }
    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }
    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
    @JsonProperty("currently")
    public Currently getCurrently() {
        return currently;
    }
    @JsonProperty("currently")
    public void setCurrently(Currently currently) {
        this.currently = currently;
    }

    @JsonProperty("daily")
    public Daily getDaily() {
        return daily;
    }

    @JsonProperty("daily")
    public void setDaily(Daily daily) {
        this.daily = daily;
    }

    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

}
