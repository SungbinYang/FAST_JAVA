package me.sungbin.ch09.interfaceex;

public interface Buy {

    void buy();

    default void order() {
        System.out.println("구매 주문");
    }
}
