package com.heba.tadbeer.classes;

import java.net.URI;

/**
 * Created by root on 3/13/16.
 */
public class Item {
    private int id;
    private String Name;
    private String barcode;
    private String description;
    private String categoryId;
    private URI imageUrl;
    private String unit;
    private int retailerId;

    public Item(int id, String name, String barcode, String description, String categoryId, URI imageUrl, String unit, int retailerId) {
        this.id = id;
        Name = name;
        this.barcode = barcode;
        this.description = description;
        this.categoryId = categoryId;
        this.imageUrl = imageUrl;
        this.unit = unit;
        this.retailerId = retailerId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getDescription() {
        return description;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public URI getImageUrl() {
        return imageUrl;
    }

    public String getUnit() {
        return unit;
    }

    public int getRetailerId() {
        return retailerId;
    }
}
