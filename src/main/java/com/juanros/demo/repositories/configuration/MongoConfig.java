/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.juanros.demo.repositories.configuration;

import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

/**
 *
 * @author juan
 */
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "MongoDB";
    }
    
    @Override
    protected boolean autoIndexCreation() {
        return true;
    }
    
}
