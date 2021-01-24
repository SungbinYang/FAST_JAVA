package me.sungbin.ch06.array;

public class TwoDimension {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3}, {4,5,6,7}};

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
