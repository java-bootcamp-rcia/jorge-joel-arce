package app.Client;

import app.city2.ForecastList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(url = "https://api.openweathermap.org/data/2.5/group?id=", name = "MultipleIDsClient")
public interface CitiesListClient {

    @GetMapping("/cities")
    ForecastList getCitiesList(@RequestParam(value = "cities", required = false) List<String> cities);
}
