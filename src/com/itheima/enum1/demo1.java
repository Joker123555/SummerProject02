package com.itheima.enum1;

public enum demo1 {
    //枚举类，第一行只能罗列枚举对象的名称，这些名称的本质是常量
    x,y,z;
    private String name;
    private  int price;

    public void Demo1(String name,int price){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
