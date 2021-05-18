/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanros.demo.repositories;

import com.juanros.demo.entities.WeatherStation;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;


/**
 *
 * @author juan
 */

public interface WeatherStationRepository extends MongoRepository<WeatherStation, String>{
    public WeatherStation findByDeviceId(Long deviceId);
    public List<WeatherStation> deleteByDeviceId(Long deviceId);
}
