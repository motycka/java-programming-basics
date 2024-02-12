package com.harbourspace.model;

public class Error {
    public static Sensor invalidUnitError() throws IllegalArgumentException {
        throw new IllegalArgumentException("Invalid unit type");
    }
}
