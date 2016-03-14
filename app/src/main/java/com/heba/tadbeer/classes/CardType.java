package com.heba.tadbeer.classes;

import java.net.URI;

/**
 * Created by root on 3/13/16.
 */
public class CardType {
    private int id;
    private String name;
    private int retailerId;
    private URI imageUrl;

    public CardType(int id, String name, int retailerId) {
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

    public URI getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(URI imageUrl) {
        this.imageUrl = imageUrl;
    }
}
