package pl.javastart.cookbook.weather.model;

import lombok.Data;

@Data
public class Alert {
    private String sender_name;
    private String event;
    private Long start;
    private Long end;
    private String description;
}
