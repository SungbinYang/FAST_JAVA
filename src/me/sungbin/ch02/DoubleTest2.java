package me.sungbin.ch02;

public class DoubleTest2 {
    public static void main(String[] args) {

        double dNum = 1;

        for (int i = 0; i < 10000; i++) {
            dNum += 0.1;
        }
        System.out.println(dNum); // 부동소수점의 오류
    }
}
