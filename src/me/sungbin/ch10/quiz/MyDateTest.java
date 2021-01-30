package me.sungbin.ch10.quiz;

public class MyDateTest {
    public static void main(String[] args) {

        MyDate myDate = new MyDate(2020, 12, 31);
        MyDate date = new MyDate(2020, 12, 31);

        System.out.println(myDate.equals(date));
        System.out.println(myDate.hashCode());
        System.out.println(date.hashCode());
    }
}
