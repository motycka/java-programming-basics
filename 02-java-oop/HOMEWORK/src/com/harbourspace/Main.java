package com.harbourspace;

import com.harbourspace.model.MeteoStation;
import com.harbourspace.model.Sensor;

public class Main {

    public static void main(String[] args) {

        MeteoStation meteoStation = new MeteoStation("Meteo station on Campus", new Double[]{49.123456, 16.123456});

        System.out.println("Name: " + meteoStation.getName());
        System.out.println("Latitude: " + meteoStation.getPosition()[0]);
        System.out.println("Longitude: " + meteoStation.getPosition()[1]);
        System.out.println("Firmware: " + meteoStation.getVersionInfo().getFirmware());
        for (Sensor sensor : meteoStation.getSensors()) {
            System.out.println("Sensor: " + sensor.type().getTypeName() + " " + sensor.value() + " " + sensor.unit().getSymbol());
        }
    }

}
