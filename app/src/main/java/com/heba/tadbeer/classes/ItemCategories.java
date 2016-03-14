package com.heba.tadbeer.classes;

/**
 * Created by root on 3/13/16.
 */
public class ItemCategories {
    private int id;
    private String name;
    private int retailerId;

    public ItemCategories(int id, String name, int retailerId) {
        this.id = id;
        this.name = name;
        this.retailerId = retailerId;
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
}
