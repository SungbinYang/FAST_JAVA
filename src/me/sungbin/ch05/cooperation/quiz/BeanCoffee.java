package me.sungbin.ch05.cooperation.quiz;

public class BeanCoffee {

    String kind;
    int price;

    public BeanCoffee(String kind, int price) {
        this.kind = kind;
        this.price = price;
    }

    public void sell(int price) {
        this.price += price;
    }
}
