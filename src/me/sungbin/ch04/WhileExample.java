package me.sungbin.ch04;

public class WhileExample {
    public static void main(String[] args) {

        int num = 1;
        int sum = 0;

        while (num < 11) {
            sum += num;
            num++;
        }

        System.out.println(sum);
        System.out.println(num);
    }
}
