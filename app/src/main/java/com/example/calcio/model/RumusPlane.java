package com.example.calcio.model;

import android.widget.ImageView;

public class RumusPlane {

    private String Title;
    private String Description1;
    private String Description2;
    private int Image;

    public RumusPlane() {
    }

    public RumusPlane(String title, String description1, String description2, int image) {
        Title = title;
        Description1 = description1;
        Description2 = description2;
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription1() {
        return Description1;
    }

    public String getDescription2() {
        return Description2;
    }

    public int getImage() {
        return Image;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription1(String description1) {
        Description1 = description1;
    }

    public void setDescription2(String description2) {
        Description2 = description2;
    }

    public void setImage(int image) {
        Image = image;
    }
}
