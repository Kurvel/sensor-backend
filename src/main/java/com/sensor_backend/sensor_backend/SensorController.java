package com.sensor_backend.sensor_backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class SensorController {
    
    @Autowired
    private SensorService sensorService;

    @PostMapping("/sensor")
    public Sensor saveSensorData(@RequestBody Sensor sensor) {
        String testTemp = sensor.getTemp();
        String testHum = sensor.getHumidity();
        System.out.println("temp: " + testTemp);
        System.out.println("hum: " + testHum);
        return sensorService.saveSensorData(sensor);
    }

    @GetMapping("/sensor")
    public List<Sensor> getAllSensorData() {
        return sensorService.getAllSensorData();
    }
}
