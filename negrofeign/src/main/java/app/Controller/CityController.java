package app.Controller;

import app.Client.CityClient;
import app.Model.City;
import app.Model.CityFiveDaysForecast;
import app.Repository.CityRepository;
import app.Service.CityService;
import app.Service.ForecastService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityClient cityClient;
    @Autowired
    private CityService cityService;
    @Autowired
    private ForecastService forecastService;
    @Autowired
    private CityRepository cityRepository;



    @GetMapping("/{woeid}")
    @ApiOperation(value = "Finds and store city and five days forecasts by ID",
                response = CityFiveDaysForecast.class)
    public CityFiveDaysForecast getFiveDaysForecast(@ApiParam(value = "City ID needs to be retrieved", required = true)
                                                        @PathVariable Long woeid){

        cityService.saveCity(cityClient.getFiveDaysForecast(woeid));
        return cityClient.getFiveDaysForecast(woeid);

    }

    @GetMapping("/top")
    @ApiOperation(value = "Get the top five most requested cities",
            response = List.class)
    public List<String> getTopFive(){
        return cityRepository.getTopFive();
    }

    @GetMapping("/bottom")
    @ApiOperation(value = "Get the top five least requested cities",
            response = List.class)
    public List<String> getBottomFive(){
        return cityRepository.getBottomFive();
    }



    /*@GetMapping("/cities")
    public ForecastList getCities(@RequestParam(value = "cities", required = false) List<String> cities){

        return citiesListClient.getCitiesList(cities);
    }*/

}
