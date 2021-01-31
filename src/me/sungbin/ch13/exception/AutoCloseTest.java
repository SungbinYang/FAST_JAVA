package me.sungbin.ch13.exception;

public class AutoCloseTest {
    public static void main(String[] args) {
        AutoCloseObj obj = new AutoCloseObj();
        try(obj) {
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
