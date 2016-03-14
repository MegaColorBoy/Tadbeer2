package com.heba.tadbeer.classes;

/**
 * Created by root on 3/13/16.
 */
public class Retailer {
    private int id;
    private String name;

    public Retailer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
