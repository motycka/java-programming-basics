package com.harbourspace;

import com.harbourspace.model.Sensor;
import com.harbourspace.model.UnitType;

public class Main {

    public static void main(String[] args) {

        Sensor sensor = new Sensor(UnitType.CELSIUS, 25.0);

        System.out.println("Unit: " + sensor.unit());
        System.out.println("Value: " + sensor.value());
        System.out.println("Is Celsius: " + sensor.isCelsius());
        System.out.println("Is Fahrenheit: " + sensor.isFahrenheit());
        System.out.println("To Celsius: " + sensor.toCelsius());
        System.out.println("To Fahrenheit: " + sensor.toFahrenheit());
        System.out.println("Value equals: " + sensor.valueEquals(new Sensor(UnitType.CELSIUS, 25.0)));
    }

}
