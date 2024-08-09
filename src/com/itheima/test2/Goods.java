package com.itheima.test2;

public class Goods {
    private String id;
    private String name;
    private double price;
    private int number;

    public Goods() {
    }

    public Goods(int number, double price, String name, String id) {
        this.number = number;
        this.price = price;
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
