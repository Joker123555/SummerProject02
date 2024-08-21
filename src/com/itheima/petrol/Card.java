package com.itheima.petrol;

public class Card {
    private int carId;
    private int cardId;
    private String name;
    private String phoneNumber;
    private double cardFound;

    public Card() {
    }
    public Card(int carId, int cardId, String name, String phoneNumber, double cardFound) {
        this.carId = carId;
        this.cardId = cardId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.cardFound = cardFound;
    }

    public int getCarId() {
        return carId;
    }


    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getCardFound() {
        return cardFound;
    }

    public void setCardFound(double cardFound) {
        this.cardFound = cardFound;
    }

    @Override
    public String toString() {
        return "card{" +
                "carId=" + carId +
                ", cardId=" + cardId +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", cardFound=" + cardFound +
                '}';
    }

    //使用卡内余额
    public double useCard(int found)
    {
       cardFound=cardFound-found;
       return cardFound;
    }


}
