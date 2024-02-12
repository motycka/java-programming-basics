package com.harbourspace;


import com.harbourspace.model.Sensor;

public class Main {

    public static void main(String[] args) {
        Sensor sensor = new Sensor("C", 25.0);

        System.out.println("Unit: " + sensor.unit());
        System.out.println("Value: " + sensor.value());
    }

}
