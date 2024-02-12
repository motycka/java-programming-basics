package com.harbourspace.model;

public class MeteoStation {

    private final String name;
    private Double[] position;

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

}
