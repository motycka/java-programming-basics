package com.harbourspace.model;

public enum UnitType {
    CELSIUS("C"),
    FAHRENHEIT("F"),
    PERCENT("%"),
    MILLIMETER("mm"),
    ;

    private final String symbol;

    UnitType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
