package me.sungbin.ch06.array.quiz;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student(1001, "Lee");
        Student studentKim = new Student(1002, "Kim");
        Student studentCho = new Student(1003, "Cho");

        studentLee.read("태백산맥1");
        studentLee.read("태맥산맥2");

        studentKim.read("토지1");
        studentKim.read("토지2");
        studentKim.read("토지3");

        studentCho.read("해리포터1");
        studentCho.read("해리포터2");
        studentCho.read("해리포터3");
        studentCho.read("해리포터4");
        studentCho.read("해리포터5");
        studentCho.read("해리포터6");

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();
        studentCho.showStudentInfo();

    }
}
