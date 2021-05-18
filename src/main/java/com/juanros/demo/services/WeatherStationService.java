/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanros.demo.services;

import com.juanros.demo.entities.WeatherStation;
import java.util.List;

/**
 *
 * @author juan
 */
public interface WeatherStationService {
    public WeatherStation create(WeatherStation weatherStation);
    public WeatherStation read(Long deviceId);
    public WeatherStation update(WeatherStation weatherStation);
    public boolean delete(Long deviceId);
    public List<WeatherStation> readAll();
}
