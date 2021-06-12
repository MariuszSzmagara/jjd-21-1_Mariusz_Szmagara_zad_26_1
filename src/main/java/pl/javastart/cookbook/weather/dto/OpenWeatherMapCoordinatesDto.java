package pl.javastart.cookbook.weather.dto;

import lombok.Data;
import pl.javastart.cookbook.weather.model.Coordinates;

@Data
public class OpenWeatherMapCoordinatesDto {
    private Coordinates coord;
}
