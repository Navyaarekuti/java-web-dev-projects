package org.launchcode;

import java.time.LocalDate;

public class MenuItem {

    private double price;
    private String des;
    private String cat;
    private String name;
    private final LocalDate dateAdded;

    public MenuItem(double price, String des, String cat, String name) {
        this.price = price;
        this.des = des;
        this.cat = cat;
        this.name = name;
        this.dateAdded = LocalDate.now();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }
}

