package com.sensor_backend.sensor_backend;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorService {
    
    @Autowired
    private SensorRepository sensorRepository;

    public Sensor saveSensorData(Sensor sensor) {
        ZonedDateTime swedenTime = ZonedDateTime.now(ZoneId.of("Europe/Stockholm"));
        sensor.setTimestamp(swedenTime.toLocalDateTime());
        return sensorRepository.save(sensor);
    }

    public List<Sensor> getAllSensorData() {
        return sensorRepository.findAll();
    }
}
