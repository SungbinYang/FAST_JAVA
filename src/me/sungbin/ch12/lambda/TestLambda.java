package me.sungbin.ch12.lambda;

@FunctionalInterface
interface PrintString {
    void showString(String str);
}

public class TestLambda {
    public static void main(String[] args) {

        PrintString lambdaStr = System.out::println;
        lambdaStr.showString("Test");

        showMyString(lambdaStr);

        PrintString test = returnString();
        test.showString("Test3");
    }

    public static void showMyString(PrintString p) {
        p.showString("Test2");
    }

    public static PrintString returnString() {
        return str -> System.out.println(str + "!!!");
    }
}
