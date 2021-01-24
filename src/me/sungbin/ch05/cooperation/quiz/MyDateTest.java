package me.sungbin.ch05.cooperation.quiz;

public class MyDateTest {
    public static void main(String[] args) {

        MyDate date1 = new MyDate(29, 2, 2021);
        System.out.println(date1.isValid());

        MyDate date2 = new MyDate(33, 13, 2021);
        System.out.println(date2.isValid());

        MyDate date3 = new MyDate(29, 2, 2016);
        System.out.println(date3.isValid());
    }
}
