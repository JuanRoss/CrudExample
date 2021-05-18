/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanros.demo.controller;

import com.juanros.demo.entities.WeatherStation;
import com.juanros.demo.services.WeatherStationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juan
 */
@RestController
@RequestMapping("/weatherStation")
public class WeatherStationController {
    
    @Autowired
    private WeatherStationService weatherStationService;
    
    @GetMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public WeatherStation getWeatherStationByDeviceId(@PathVariable Long id) {
        return weatherStationService.read(id);
    }
    
    @GetMapping()
    public List<WeatherStation> getAllWeatherStation() {
        return weatherStationService.readAll();
    }
    
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public WeatherStation createWeatherStation(@RequestBody WeatherStation weatherStation) {
        return weatherStationService.create(weatherStation);
    }
    
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public WeatherStation updateWeahterStation(@RequestBody WeatherStation weatherStation) {
        return weatherStationService.update(weatherStation);
    }
    
    @DeleteMapping("{deviceId}")
    public String deleteWeatherStationById(@PathVariable Long deviceId) {
        String response = (weatherStationService.delete(deviceId)) ? "Elemento borrado correctamente" : "Elemento no encontrado";
        return response;
    }
}
