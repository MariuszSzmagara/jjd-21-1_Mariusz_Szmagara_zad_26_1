package pl.javastart.cookbook.weather.model;

import lombok.Data;

@Data
public class Temp {
    private double day;
    private double min;
    private double max;
    private double night;
    private double eve;
    private double morn;

    public int getDay() {
        return (int) Math.round(day);
    }
}
