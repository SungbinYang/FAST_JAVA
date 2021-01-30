package me.sungbin.ch10.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, NoSuchMethodException, InvocationTargetException {

        Person person = new Person("james");
        System.out.println(person);

        Class c1 = Class.forName("me.sungbin.ch10.classex.Person");
        Person person1 = (Person) c1.newInstance();
        System.out.println(person1);

        Class[] parmeter = {String.class};
        Constructor cons = c1.getConstructor(parmeter);
        Object[] init = {"김유신"};
        Person personLee = (Person) cons.newInstance(init);
        System.out.println(personLee);
    }
}
