package me.sungbin.ch13.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {


        try(FileInputStream fis = new FileInputStream("./src/me/sungbin/ch13/a.txt")) {

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
