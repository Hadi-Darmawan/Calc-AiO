package com.example.calcio.model;

public class Menaikan {

    private String Title;
    private String Description1;

    public Menaikan() {
    }

    public Menaikan(String title, String description1) {
        Title = title;
        Description1 = description1;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription1() {
        return Description1;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription1(String description1) {
        Description1 = description1;
    }

}
