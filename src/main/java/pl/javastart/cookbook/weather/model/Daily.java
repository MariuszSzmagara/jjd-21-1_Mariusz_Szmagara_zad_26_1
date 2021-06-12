package pl.javastart.cookbook.weather.model;

import lombok.Data;

@Data
public class Daily {
    private Long dt;
    private Long sunrise;
    private Long sunset;
    private Long moonrise;
    private Long moonset;
    private double moon_phase;
    private Temp temp;
    private TempFeelsLike feels_like;
    private int pressure;
    private int humidity;
    private double dew_point;
    private double wind_speed;
    private int wind_deg;
    private Weather[] weather;
}
