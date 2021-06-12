package pl.javastart.cookbook.weather.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.javastart.cookbook.weather.dto.OpenWeatherMapOneCallDto;
import pl.javastart.cookbook.weather.model.Coordinates;
import pl.javastart.cookbook.weather.dto.OpenWeatherMapCoordinatesDto;
import pl.javastart.cookbook.weather.model.OpenWeatherMapCityNotFoundException;

@Service
public class WeatherService {
    public static final String API_KEY = "2bf25e47c4f9d6ef6aa38b01dbb9348a";

    public OpenWeatherMapOneCallDto getWeatherConditions(String cityName) {
        RestTemplate restTemplate = new RestTemplate();
        Coordinates coordinates = getCoordinatesFromCurrentWeatherDataResponse(cityName);
        return restTemplate.getForObject("https://api.openweathermap.org/data/2.5/onecall?lat={lat}&lon={lon}&exclude=minutely,hourly&units={units}&appid={apiKey}", OpenWeatherMapOneCallDto.class, coordinates.getLat(), coordinates.getLon(), "metric", API_KEY);
    }

    private Coordinates getCoordinatesFromCurrentWeatherDataResponse(String cityName) {
        RestTemplate restTemplate = new RestTemplate();
        try {
            OpenWeatherMapCoordinatesDto forObject = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}", OpenWeatherMapCoordinatesDto.class, cityName, API_KEY);
            return forObject.getCoord();
        } catch (Exception exception) {
            throw new OpenWeatherMapCityNotFoundException(cityName);
        }
    }
}
