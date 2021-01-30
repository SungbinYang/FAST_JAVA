package me.sungbin.ch10.quiz;

import java.util.Objects;

public class MyDate {

    int year;
    int month;
    int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof MyDate) {
            MyDate myDate = (MyDate) o;
            if ((this.month < 1 || this.month > 12) || (this.day < 1 || this.day > 31) ) {
                return false;
            } else {
                return this.year == myDate.year && this.month == myDate.month && this.day == myDate.day;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return year + month + day;
    }
}
