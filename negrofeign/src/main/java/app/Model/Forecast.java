package app.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
@ApiModel(description = "Forecast details")
public class Forecast {

    @ApiModelProperty(notes = "Unique ID of forecast")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long forecastId;
    @ApiModelProperty(notes = "Describes the weather caracteristics")
    private String weatherStateName;
    @ApiModelProperty(notes = "The date of the forecast")
    private String applicableDate;
    @ApiModelProperty(notes = "Minimum temperature")
    private Double minTemp;
    @ApiModelProperty(notes = "Maximum temperature")
    private Double maxTemp;
    @ApiModelProperty(notes = "Humidity percentage")
    private Integer humidity;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "city_id")
    private City city;

    public Forecast() {
    }

    public Forecast(String weatherStateName, String applicableDate, Double minTemp, Double maxTemp, Integer humidity) {
        this.weatherStateName = weatherStateName;
        this.applicableDate = applicableDate;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.humidity = humidity;
    }

    public Forecast(String weatherStateName, String applicableDate, Double minTemp, Double maxTemp, Integer humidity, City city) {
        this.weatherStateName = weatherStateName;
        this.applicableDate = applicableDate;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.humidity = humidity;
        this.city = city;
    }

    public Long getForecastId() {
        return forecastId;
    }

    public void setForecastId(Long forecastId) {
        this.forecastId = forecastId;
    }

    public String getWeatherStateName() {
        return weatherStateName;
    }

    public void setWeatherStateName(String weatherStateName) {
        this.weatherStateName = weatherStateName;
    }

    public String getApplicableDate() {
        return applicableDate;
    }

    public void setApplicableDate(String applicableDate) {
        this.applicableDate = applicableDate;
    }

    public Double getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(Double minTemp) {
        this.minTemp = minTemp;
    }

    public Double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(Double maxTemp) {
        this.maxTemp = maxTemp;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    @JsonBackReference
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
