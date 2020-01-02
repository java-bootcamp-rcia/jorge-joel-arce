package app.Client;


import app.Model.City;
import app.Model.CityFiveDaysForecast;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(url = "https://www.metaweather.com/api/location", name = "WeatherClient")
public interface CityClient {

    @GetMapping("/{woeid}")
    CityFiveDaysForecast getFiveDaysForecast(@PathVariable Long woeid);


}
