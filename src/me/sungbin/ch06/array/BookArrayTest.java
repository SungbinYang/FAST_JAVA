package me.sungbin.ch06.array;

public class BookArrayTest {
    public static void main(String[] args) {

        Book[] library = new Book[5];

        library[0] = new Book("해리포터1", "jacob");
        library[1] = new Book("해리포터2", "jacob");
        library[2] = new Book("해리포터3", "jacob");
        library[3] = new Book("해리포터4", "jacob");
        library[4] = new Book("해리포터5", "jacob");


        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
            library[i].showBookInfo();
        }
    }
}
