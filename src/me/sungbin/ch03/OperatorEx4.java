package me.sungbin.ch03;

public class OperatorEx4 {
    public static void main(String[] args) {

        int num1 = 10;
        int i = 2;

        boolean value = ((num1 += 10) < 10) && ((i+=2) < 10);
        System.out.println(num1);
        System.out.println(i);
        // short circuit evaluation
        System.out.println(value);

        int num2 = 10;
        int num3 = 20;

        int max = (num2 > num3) ? num2 : num3;
        System.out.println(max);
    }
}
