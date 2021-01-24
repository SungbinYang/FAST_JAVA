package me.sungbin.ch05.cooperation.quiz;

public class Person {
    String name;
    int totalPrice;

    public Person(String name, int totalPrice) {
        this.name = name;
        this.totalPrice = totalPrice;
    }

    public void purchace(StarCoffee starCoffee) {
        this.totalPrice -= starCoffee.price;
        System.out.println(this.name + "님이 " + starCoffee.kind + "를 " + starCoffee.price + "주고 사먹었습니다.");
        System.out.println("현재 남은 돈은 " + this.totalPrice + " 입니다.");
    }

    public void purchace(BeanCoffee beanCoffee) {
        this.totalPrice -= beanCoffee.price;
        System.out.println(this.name + "님이 " + beanCoffee.kind + "를 " + beanCoffee.price + "주고 사먹었습니다.");
        System.out.println("현재 남은 돈은 " + this.totalPrice + " 입니다.");
    }
}
