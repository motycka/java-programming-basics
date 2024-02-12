package com.harbourspace.model;

public class MeteoStation {

    private final String name;
    private Double[] position;

    private final VersionInfo versionInfo = new VersionInfo("1.0.0");

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
        return versionInfo;
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
