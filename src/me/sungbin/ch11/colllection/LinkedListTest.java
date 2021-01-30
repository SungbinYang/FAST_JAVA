package me.sungbin.ch11.colllection;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<String> myList = new LinkedList<>();

        myList.add("A");
        myList.add("B");
        myList.add("C");
        System.out.println(myList);

        myList.add(1, "D");
        System.out.println(myList);
        myList.removeLast();
        System.out.println(myList);

        for (String s : myList) {
            System.out.println(s);
        }

    }
}
