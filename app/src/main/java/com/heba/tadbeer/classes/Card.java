package com.heba.tadbeer.classes;



/**
 * Created by root on 3/13/16.
 */
public class Card {
    private int id;
    private int number;
    private int retailerId;
    private String OwnerIdentifier;
    private int typeId;
    private double points;
    private long issuDate;
    private long expiryDate;

    public Card(int id, int number, int retailerId, String ownerIdentifier, int typeId, long issuDate, long expiryDate, double points) {
        this.id = id;
        this.number = number;
        this.retailerId = retailerId;
        OwnerIdentifier = ownerIdentifier;
        this.typeId = typeId;
        this.issuDate = issuDate;
        this.expiryDate = expiryDate;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public String getOwnerIdentifier() {
        return OwnerIdentifier;
    }

    public int getTypeId() {
        return typeId;
    }

    public double getPoints() {
        return points;
    }

    public long getIssuDate() {
        return issuDate;
    }

    public long getExpiryDate() {
        return expiryDate;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getRetailerId() {
        return retailerId;
    }
}
