/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanros.demo.services.impl;

import com.juanros.demo.entities.WeatherStation;
import com.juanros.demo.repositories.WeatherStationRepository;
import com.juanros.demo.services.WeatherStationService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author juan
 */
@Service
public class WeatherStationServiceImpl implements WeatherStationService {
    
    @Autowired
    private WeatherStationRepository weatherStationRepository;
    

    @Override
    public WeatherStation create(WeatherStation weatherStation) {
        return weatherStationRepository.insert(weatherStation);
    }

    @Override
    public WeatherStation read(Long deviceId) {
        return weatherStationRepository.findByDeviceId(deviceId);
    }

    @Override
    public WeatherStation update(WeatherStation weatherStation) {
        return weatherStationRepository.save(weatherStation);
    }

    @Override
    public boolean delete(Long deviceId) {
        try {
            weatherStationRepository.deleteByDeviceId(deviceId);
        }catch(IllegalArgumentException ex) {
            System.out.println("Element not found!");
            return false;
        }
        return true;
    }

    @Override
    public List<WeatherStation> readAll() {
        return weatherStationRepository.findAll();
    }
    
}
