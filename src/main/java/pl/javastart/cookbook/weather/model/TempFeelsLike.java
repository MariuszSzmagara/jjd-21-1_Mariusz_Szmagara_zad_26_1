package pl.javastart.cookbook.weather.model;

import lombok.Data;

@Data
public class TempFeelsLike {
    private double day;
    private double night;
    private double eve;
    private double morn;

    public int getDay() {
        return (int) Math.round(day);
    }
}
