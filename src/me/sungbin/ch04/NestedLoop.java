package me.sungbin.ch04;

public class NestedLoop {
    public static void main(String[] args) {

        int dan;
        int count;

        for (dan = 2; dan < 10; dan++) {
            for (count = 1; count < 10; count++) {
                System.out.println(dan + "x" + count + "=" + dan*count);
            }
            System.out.println();
        }
    }
}
