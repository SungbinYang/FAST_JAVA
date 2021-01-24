package me.sungbin.ch05.classpart.quiz;

public class PersonTest {
    public static void main(String[] args) {

        Person person = new Person();
        person.age = 40;
        person.name = "James";
        person.isMarried = true;
        person.child = 3;

        person.showPersonInfo();
    }
}
