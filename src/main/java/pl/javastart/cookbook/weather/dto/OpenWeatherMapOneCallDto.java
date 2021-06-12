package pl.javastart.cookbook.weather.dto;

import lombok.Data;
import pl.javastart.cookbook.weather.model.Alert;
import pl.javastart.cookbook.weather.model.Current;
import pl.javastart.cookbook.weather.model.Daily;
import pl.javastart.cookbook.weather.model.Weather;

@Data
public class OpenWeatherMapOneCallDto {
    private double lat;
    private double lon;
    private String timezone;
    private Current current;
    private Weather[] weather;
    private Daily[] daily;
    private double clouds;
    private double pop;
    private double rain;
    private double uvi;
    private Alert[] alerts;

}
