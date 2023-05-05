package com.example.badiapp.model;

import java.util.ArrayList;
import java.util.List;

public class Badi {

    private Integer id;

    private String name;

    private String ort;

    private String kanton;

    private List<Becken> beckenList;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getKanton() {
        return kanton;
    }

    public void setKanton(String kanton) {
        this.kanton = kanton;
    }

    public List<Becken> getBeckenList() {
        return beckenList;
    }

    public void setBeckenList(List<Becken> beckenList) {
        this.beckenList = beckenList;
    }

    @Override
    public String toString() {
        return    name + " " + ort +" " + kanton + " ";
    }

    public Badi() {
        beckenList = new ArrayList<>();
    }

    public Badi(Integer id, String name, String ort, String kanton) {
        this.id = id;
        this.name = name;
        this.ort = ort;
        this.kanton = kanton;


    }



    public void removeBecken(List<Becken> list, String name) {

        if (list.contains(name)) {

            list.remove(name);

            System.out.println("Eintrag " + name + " wurde aus der Liste entfernt.");

        } else {

            System.out.println("Eintrag " + name + " wurde nicht gefunden.");
        }
    }

    public void addBecken( Becken becken) {

        beckenList.add(becken);
            System.out.println("Eintrag " + becken + " wurde aus der Liste entfernt.");
    }


}
