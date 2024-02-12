package com.harbourspace;

import com.harbourspace.model.MeteoStation;

public class Main {

    public static String name1 = "Meteo 1";
    public static String name2 = "Meteo 2";
    public static Double[] position1 = new Double[]{49.123456, 16.123456};
    public static Double[] position2 = new Double[]{50.123456, 15.123456};

    public static void main(String[] args) {

        MeteoStation meteoStation1 = new MeteoStation(name1, position1);

        MeteoStation meteoStation2 = new MeteoStation(name2);
        meteoStation2.setPosition(position2);

        System.out.println("Name: " + meteoStation1.getName());
        System.out.println("Latitude: " + meteoStation1.getPosition()[0]);
        System.out.println("Longitude: " + meteoStation1.getPosition()[1]);

        System.out.println("Name: " + meteoStation2.getName());
        System.out.println("Latitude: " + meteoStation2.getPosition()[0]);
        System.out.println("Longitude: " + meteoStation2.getPosition()[1]);
    }

}
