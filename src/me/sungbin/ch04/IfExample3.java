package me.sungbin.ch04;

import java.util.Scanner;

public class IfExample3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        char grade;

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score <= 89 && score >= 80) {
            grade = 'B';
        } else if (score <= 79 && score >= 70) {
            grade = 'C';
        } else if (score <= 69 && score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        scanner.close();
        System.out.println("당신의 점수는 " + grade + " 입니다.");

        int a = 10;
        int b = 20;

        int max;

        max = (a > b) ? a : b;
        System.out.println(max);

    }
}
