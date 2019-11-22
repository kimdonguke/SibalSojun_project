package com.example.sibalsojun_project;

import android.graphics.drawable.Drawable;

public class Data {
    private String Name;
    private String kalori;
    private Drawable foodImg;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getKalori() {
        return kalori;
    }

    public void setKalori(String kalori) {
        this.kalori = kalori;
    }

    public Drawable getFoodImg() {
        return foodImg;
    }

    public void setFoodImg(Drawable foodImg) {
        this.foodImg = foodImg;
    }

}
