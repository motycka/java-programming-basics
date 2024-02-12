package com.harbourspace.model;

public class MeteoStation {

    private final String name;
    private Double[] position;

    private final VersionInfo version = new VersionInfo("1.0.0");

    private final Sensor[] sensors = {
            new Sensor(SensorType.TEMPERATURE, UnitType.CELSIUS, 25.0),
            new Sensor(SensorType.HUMIDITY, UnitType.PERCENT, 64.0),
            new Sensor(SensorType.PRECIPITATION, UnitType.MILLIMETER, 10.0)
    };

    // constructor 1
    public MeteoStation(String subject, Double[] position) {
        this.name = subject;
        this.position = position;
    }

    // constructor 2
    public MeteoStation(String subject) {
        this.name = subject;
        this.position = null;
    }

    public String getName() {
        return name;
    }

    public Double[] getPosition() {
        return position;
    }

    public void setPosition(Double[] position) {
        this.position = position;
    }

    public VersionInfo getVersionInfo() {
        return version;
    }

    public Sensor[] getSensors() {
        return sensors;
    }

    public static class VersionInfo {
        private final String firmware;

        public VersionInfo(String firmware) {
            this.firmware = firmware;
        }

        public String getFirmware() {
            return firmware;
        }
    }

}
