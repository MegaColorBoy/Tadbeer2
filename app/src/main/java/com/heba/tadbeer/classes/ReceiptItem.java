package com.heba.tadbeer.classes;

/**
 * Created by root on 3/13/16.
 */
public class ReceiptItem {
    private int id;
    private int receiptId;
    private int itemId;
    private double quantity;
    private double price;
    private double total;
    private boolean UnderWarranty;
    private int warrantyId;
    private double points;

    public ReceiptItem(int id, int receiptId, int itemId, double quantity, double price, double total, boolean underWarranty, int warrantyId, double points) {
        this.id = id;
        this.receiptId = receiptId;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        UnderWarranty = underWarranty;
        this.warrantyId = warrantyId;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public int getReceiptId() {
        return receiptId;
    }

    public int getItemId() {
        return itemId;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal() {
        return total;
    }

    public boolean isUnderWarranty() {
        return UnderWarranty;
    }

    public int getWarrantyId() {
        return warrantyId;
    }

    public double getPoints() {
        return points;
    }
}
