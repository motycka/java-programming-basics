package com.harbourspace.model;

public record Sensor(
        String unit,
        double value
) {

    public static final String CELSIUS = "C";
    public static final String FAHRENHEIT = "F";

    public Sensor {
        if (!unit.equals("C") && !unit.equals("F")) {
            Error.invalidUnitError();
        }
    }

    public boolean isCelsius() {
        return unit.equals(CELSIUS);
    }

    public boolean isFahrenheit() {
        return unit.equals(FAHRENHEIT);
    }

    public Sensor toFahrenheit() {
        if (unit.equals(CELSIUS)) {
            return new Sensor(FAHRENHEIT, value * 9 / 5 + 32);
        } else {
            return this;
        }
    }

    public Sensor toCelsius() {
        if (unit.equals(FAHRENHEIT)) {
            return new Sensor(CELSIUS, (value - 32) * 5 / 9);
        } else {
            return this;
        }
    }

    public boolean valueEquals(Sensor other) {
        if (this.isCelsius() == other.isCelsius()) {
            return this.value == other.value;
        } else {
            return this.toCelsius().value == other.toCelsius().value;
        }
    }

}
