package me.sungbin.ch11.generic;

public class Plastic extends Material{

    @Override
    public String toString() {
        return "새로운 Plastic 입니다.";
    }

    @Override
    public void doPrinting() {
        System.out.println("Plastic로 프린팅 합니다.");
    }
}
