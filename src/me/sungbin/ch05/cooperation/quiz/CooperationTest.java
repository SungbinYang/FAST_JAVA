package me.sungbin.ch05.cooperation.quiz;

public class CooperationTest {
    public static void main(String[] args) {

        Person personKim = new Person("감졸려", 10000);
        Person personLee = new Person("이피곤", 10000);

        StarCoffee starCoffee = new StarCoffee("아메리카노", 4000);
        BeanCoffee beanCoffee = new BeanCoffee("라떼", 4500);

        personKim.purchace(starCoffee);
        personLee.purchace(beanCoffee);

    }
}
