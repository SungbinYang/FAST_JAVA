package me.sungbin.ch05.thisex;

public class PersonTest {
    public static void main(String[] args) {

        Person personNonName = new Person();
        personNonName.showInfo();

        Person personLee = new Person("Lee", 26);
        personLee.showInfo();
        System.out.println(personLee);

        Person p = personLee.getSelf();
        System.out.println(p);
    }
}
