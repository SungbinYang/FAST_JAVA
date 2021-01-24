package me.sungbin.ch04;

import java.util.Scanner;

public class SwitchCaseEx2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = 0;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                day = 31;
                System.out.println(month + "월은 " + day + "일 입니다.");
            }
            case 2 -> {
                day = 28;
                System.out.println(month + "월은 " + day + "일 입니다.");
            }
            case 4, 6, 9, 11 -> {
                day = 30;
                System.out.println(month + "월은 " + day + "일 입니다.");
            }
            default -> System.out.println("1월부터 12월까지만 존재합니다");
        }
    }
}
