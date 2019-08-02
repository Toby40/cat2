package com.example.demo;

public class Unit {
    private String unitName;

    public Unit(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "unitName='" + unitName + '\'' +
                '}';
    }

}
