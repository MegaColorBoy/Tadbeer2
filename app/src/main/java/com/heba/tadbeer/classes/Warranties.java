package com.heba.tadbeer.classes;

import org.w3c.dom.Text;

/**
 * Created by root on 3/13/16.
 */
public class Warranties {
    private int id;
    private String name;
    private int retailerId;
    private String description;
    private Text terms;
    private int duration;
    private boolean limited;

    public Warranties(int id, String name, int retailerId, String description, Text terms, int duration, boolean limited) {
        this.id = id;
        this.name = name;
        this.retailerId = retailerId;
        this.description = description;
        this.terms = terms;
        this.duration = duration;
        this.limited = limited;
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

    public String getDescription() {
        return description;
    }

    public Text getTerms() {
        return terms;
    }

    public int getDuration() {
        return duration;
    }

    public boolean isLimited() {
        return limited;
    }
}
