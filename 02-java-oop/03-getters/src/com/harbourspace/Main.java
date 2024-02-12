package com.harbourspace;

import com.harbourspace.model.MeteoStation;

public class Main {

    public static void main(String[] args) {
        MeteoStation meteoStation = new MeteoStation("Meteo station on Campus");
        System.out.println(meteoStation.getName());
    }

}
