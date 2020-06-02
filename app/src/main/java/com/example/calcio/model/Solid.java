package com.example.calcio.model;

public class Solid {

    private String Name;
    private String Description;
    private int Photo;

    public Solid(){

    }

    public Solid(String name, String description, int photo) {
        Name = name;
        Description = description;
        Photo = photo;
    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
