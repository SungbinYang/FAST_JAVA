package me.sungbin.ch11.generic;

public class Powder extends Material{

    @Override
    public String toString() {
        return "새로운 Powder 입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("Powder로 프린팅 합니다.");
    }
}
