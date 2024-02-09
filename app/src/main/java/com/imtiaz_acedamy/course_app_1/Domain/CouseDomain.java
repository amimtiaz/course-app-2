package com.imtiaz_acedamy.course_app_1.Domain;

public class CouseDomain {
    private String title;
    private String owner;
    private double price;
    private double star;
    private String picPath;
    private  String des;


    public CouseDomain(String title, String owner, double price, double star, String picPath, String des) {
        this.title = title;
        this.owner = owner;
        this.price = price;
        this.star = star;
        this.picPath = picPath;
        this.des = des;
    }

    public String getTitle() {
        return title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getStar() {
        return star;
    }

    public void setStar(double star) {
        this.star = star;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
}
