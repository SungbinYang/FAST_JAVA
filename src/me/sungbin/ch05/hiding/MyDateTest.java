package me.sungbin.ch05.hiding;

public class MyDateTest {
    public static void main(String[] args) {

        MyDate date = new MyDate();

        date.setYear(2021);
        date.setMonth(77);
        date.setDay(10);

        date.showDate();

        MyDate date2 = new MyDate();
        date2.setYear(2002);
    }
}
