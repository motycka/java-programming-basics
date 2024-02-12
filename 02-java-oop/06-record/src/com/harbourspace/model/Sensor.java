package com.harbourspace.model;

public record Sensor(
        String unit,
        double value
) {

    public static final String CELSIUS = "C";
    public static final String FAHRENHEIT = "F";

    public Sensor {
        if (!unit.equals(CELSIUS) && !unit.equals(FAHRENHEIT)) {
            Error.invalidUnitError();
        }
    }
}
