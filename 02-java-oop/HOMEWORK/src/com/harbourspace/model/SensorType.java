package com.harbourspace.model;

public enum SensorType {
    TEMPERATURE("Temperature"),
    HUMIDITY("Humidity"),
    PRECIPITATION ("Precipitation");

    private String typeName;

    SensorType(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
