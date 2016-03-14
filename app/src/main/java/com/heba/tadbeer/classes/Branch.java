package com.heba.tadbeer.classes;

/**
 * Created by root on 3/13/16.
 */
public class Branch {
    private int id;
    private String name;
    private int retailerId;
    private String address;

    public Branch(int id, String name, int retailerId, String address) {
        this.id = id;
        this.name = name;
        this.retailerId = retailerId;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRetailerId() {
        return retailerId;
    }

    public String getAddress() {
        return address;
    }
}
