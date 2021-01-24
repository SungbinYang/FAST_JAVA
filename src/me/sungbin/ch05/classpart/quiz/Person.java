package me.sungbin.ch05.classpart.quiz;

public class Person {

    int age;
    String name;
    boolean isMarried;
    int child;

    public void showPersonInfo() {
        System.out.println("나이: " + age);
        System.out.println("이름: " + name);
        System.out.println("결혼여부: " + isMarried);
        System.out.println("자녀 수: " + child);
    }
}
