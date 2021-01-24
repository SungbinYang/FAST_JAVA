package me.sungbin.ch06.array;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("해리포터1", "jacob");
        library[1] = new Book("해리포터2", "jacob");
        library[2] = new Book("해리포터3", "jacob");
        library[3] = new Book("해리포터4", "jacob");
        library[4] = new Book("해리포터5", "jacob");

        System.arraycopy(library, 0, copyLibrary, 0, 5);

        /* for (Book book : copyLibrary) {
            book.showBookInfo();
        } */

        library[0].setTitle("연플리");
        library[0].setAuthor("작자미상");

        for (Book book : library) {
            book.showBookInfo();
        }

        System.out.println("====================");

        for (Book book : copyLibrary) {
            book.showBookInfo();
        }
   }
}
