package com.heba.tadbeer.classes;

import java.util.List;

/**
 * Created by root on 3/13/16.
 */
public class Receipt {
    private int id;
    private String number;
    private int cardId;
    private int branchId;
    private double points;
    private double total;
    private long date;
    private List<ReceiptItem> receiptItems;

    public Receipt(int id, String number, int cardId, int branchId, double points, double total, long date) {
        this.id = id;
        this.number = number;
        this.cardId = cardId;
        this.branchId = branchId;
        this.points = points;
        this.total = total;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public int getCardId() {
        return cardId;
    }

    public int getBranchId() {
        return branchId;
    }

    public double getPoints() {
        return points;
    }

    public double getTotal() {
        return total;
    }

    public long getDate() {
        return date;
    }

    public List<ReceiptItem> getReceiptItems() {
        return receiptItems;
    }

    public void setReceiptItems(List<ReceiptItem> receiptItem) {
        this.receiptItems = receiptItem;
    }
    public void addItemToReceipt(ReceiptItem receiptItem){
        this.receiptItems.add(receiptItem);
    }
}
