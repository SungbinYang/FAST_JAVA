package me.sungbin.ch09.interfaceex;

public interface Sell {

    void sell();

    default void order() {
        System.out.println("판매 주문");
    }
}
