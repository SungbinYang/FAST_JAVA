package me.sungbin.ch09.quiz;

import java.util.Scanner;

public class SortTest {
    public static void main(String[] args) {

        System.out.println("정렬방식을 선택하세요.");
        System.out.println("B : BubbleSort");
        System.out.println("H : HeapSort");
        System.out.println("Q : QuickSort");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Sort sort = null;
        int[] arr = {1, 2, 3, 4, 5};

        switch (str) {
            case "B", "b" -> {
                sort = new BubbleSort();
                sort.ascending(arr);
                sort.descending(arr);
                sort.description();
            }
            case "H", "h" -> {
                sort = new HeapSort();
                sort.ascending(arr);
                sort.descending(arr);
                sort.description();
            }
            case "Q", "q" -> {
                sort = new QuickSort();
                sort.ascending(arr);
                sort.descending(arr);
                sort.description();
            }
            default -> System.out.println("존재하지 않는 알고리즘입니다.");
        }
        scanner.close();
    }
}
