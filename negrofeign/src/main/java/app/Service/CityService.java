package app.Service;

import app.Model.City;
import app.Model.CityFiveDaysForecast;
import app.Repository.CityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private ForecastService forecastService;

    public void saveCity(CityFiveDaysForecast cityFiveDaysForecast){
        City city = new City();
        city.setCityName(cityFiveDaysForecast.getTitle());
        forecastService.saveAllForecasts(cityFiveDaysForecast,city);
        cityRepository.save(city);
    }

}
