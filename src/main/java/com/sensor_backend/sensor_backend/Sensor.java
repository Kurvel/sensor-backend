package com.sensor_backend.sensor_backend;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

public class Sensor {
    
    @Id
    private String id;
    private String temp;
    private String humidity;
    private LocalDateTime timestamp;

    public Sensor() {

    }

    public Sensor(String temp, String humidity, LocalDateTime timestamp) {
        this.temp = temp;
        this.humidity = humidity;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    
    
}
