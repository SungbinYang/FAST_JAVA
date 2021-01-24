package me.sungbin.ch04.practice;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {

        double num1, num2;
        double result = 0;
        char str = ' ';

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 수를 입력해주세요: ");
        num1 = scanner.nextDouble();
        System.out.print("두번째 수를 입력해주세요: ");
        num2 = scanner.nextDouble();
        System.out.print("부호를 선택해주세요: ");
        str = scanner.next().charAt(0);

        if(str == '+') {
            result = num1 + num2;
        } else if(str == '-') {
            result = num1 - num2;
        } else if(str == '*') {
            result = num1 * num2;
        } else if(str == '/') {
            result = num1 / num2;
        }

        System.out.println(result);

        scanner.close();
    }
}
