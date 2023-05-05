package com.example.badiapp.model;

public class Becken {

    private String name;

    private  double temperatur;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(double temperatur) {
        this.temperatur = temperatur;
    }

    @Override
    public String toString() {
        return name + ": " + temperatur + " C°";
    }
}
