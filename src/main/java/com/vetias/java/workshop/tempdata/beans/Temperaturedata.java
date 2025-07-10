package com.vetias.java.workshop.tempdata.beans;

public class Temperaturedata implements Sensor {
    private float temperature;
    
    public Temperaturedata(float aTemperature) {
        temperature = aTemperature;
    }
    @Override
    public float getReading() {
        return temperature;
    }

    @Override
    public void setReading(float temperature) {
        this.temperature = temperature;
    }
} 