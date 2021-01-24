package me.sungbin.ch06.array;

public class ArrayTest {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int total = 0;
        for (int i=0, num = 1; i < arr.length; i++, num++) {
            arr[i] = num;
        }
        for (int j : arr) {
            System.out.println(j);
            total += j;
        }
        System.out.println(total);

        double[] dArr = new double[5];
        int count = 0;
        dArr[0] = 1.1;
        count++;
        dArr[1] = 2.1;
        count++;
        dArr[2] = 3.1;
        count++;

        double sum = 1;
        for (int i = 0; i < count; i++) {
            sum *= dArr[i];
        }
        System.out.println(sum);
    }
}
