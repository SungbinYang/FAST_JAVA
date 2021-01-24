package me.sungbin.ch06.array.quiz;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;
    ArrayList<Book> list;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        list = new ArrayList<>();
    }

    public void read(String bookName) {
        Book book = new Book(bookName);
        list.add(book);
    }

    public void showStudentInfo() {
        System.out.print(studentName + "학생이 읽은 책은 : ");

        for (Book book : list) {
            System.out.print(book.getName() + " ");
        }
        System.out.println(" 입니다.");
        System.out.println("=============================");
    }
}
