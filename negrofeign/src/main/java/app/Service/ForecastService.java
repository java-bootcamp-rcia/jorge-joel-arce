package app.Service;

import app.Model.City;
import app.Model.CityFiveDaysForecast;
import app.Model.FiveDaysForecast;
import app.Model.Forecast;
import app.Repository.ForecastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ForecastService {

    @Autowired
    private ForecastRepository forecastRepository;

    public void saveAllForecasts(CityFiveDaysForecast cityFiveDaysForecast, City city){
        City otherCity = city;
        List<Forecast> myForecast = new ArrayList<>();
        List<FiveDaysForecast> forecastList = cityFiveDaysForecast.getConsolidatedForecast();
        for (int i = 0; i < forecastList.size(); i++) {
            Forecast forecast = new Forecast();
            forecast.setApplicableDate(forecastList.get(i).getApplicableDate());
            forecast.setWeatherStateName(forecastList.get(i).getWeatherStateName());
            forecast.setMinTemp(forecastList.get(i).getMinTemp());
            forecast.setMaxTemp(forecastList.get(i).getMaxTemp());
            forecast.setHumidity(forecastList.get(i).getHumidity());
            forecast.setCity(otherCity);
            myForecast.add(forecast);

        }


        forecastRepository.saveAll(myForecast);

    }
}
