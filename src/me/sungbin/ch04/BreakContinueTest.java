package me.sungbin.ch04;

public class BreakContinueTest {
    public static void main(String[] args) {

        int dan;
        int count;

        for (dan = 2; dan < 10; dan++) {
            if (dan % 2 != 0) {
                continue;
            }
            for (count = 1; count < 10; count++) {
                if (count > dan) {
                    break;
                }
                System.out.println(dan + "x" + count + "=" + dan*count);
            }
            System.out.println();
        }
    }
}
