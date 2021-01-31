package me.sungbin.ch12.lambda;

public class TestStringConcat {
    public static void main(String[] args) {

        StringConImpl impl = new StringConImpl();
        impl.makeString("Hello", "World!");

        StringConcat concat = (s, v) -> System.out.println(s + "," + v);
        concat.makeString("Hello ", "Java");

        StringConcat stringConcat = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + "," + s2);
            }
        };

        stringConcat.makeString("hello", "world");
    }
}
