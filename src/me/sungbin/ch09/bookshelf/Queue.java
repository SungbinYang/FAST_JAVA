package me.sungbin.ch09.bookshelf;

public interface Queue {

    void enQueue(String title);
    String deQueue();

    int getSize();
}
