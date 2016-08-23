package com.gts.aarongoodman.weightd;

import java.util.Date;

public class WeightRecord {

    private String user;
    private float date;
    private float weight;

    public WeightRecord(String user, float date, float weight) {
        this.user = user;
        this.date = date;
        this.weight = weight;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public float getDate() {
        return date;
    }

    public void setDate(float date) {
        this.date = date;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


}
