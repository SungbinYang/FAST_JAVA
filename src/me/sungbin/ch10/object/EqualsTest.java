package me.sungbin.ch10.object;

import java.util.Objects;

class Student {
    int studentNum;
    String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student) obj;
            return this.studentNum == std.studentNum;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }
}

public class EqualsTest {
    public static void main(String[] args) {

        Student studentLee = new Student(100, "이순신");
        Student studentLee2 = studentLee;
        Student studentShin = new Student(100, "이순신");

        System.out.println(studentLee == studentShin);
        System.out.println(studentLee.equals(studentShin));

        System.out.println(studentLee.hashCode());
        System.out.println(studentShin.hashCode());
        System.out.println(studentLee2.hashCode());

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        System.out.println(System.identityHashCode(i1));
        System.out.println(System.identityHashCode(i2));
    }
}
