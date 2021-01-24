package me.sungbin.ch04;

public class ForExample {
    public static void main(String[] args) {

        int count;
        int sum = 0;

        for (count = 0; count < 10; count++) { // 10번
            sum += count;
        }

        int num = 1;
        int total = 0;

        while (num <= 10) {
            total += num;
            num++;
        }

        System.out.println(sum);
        System.out.println(total);
    }
}
