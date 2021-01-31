package me.sungbin.ch12.lambda;

@FunctionalInterface
public interface MyMaxNumber { // functional Interface는 2개이상의 함수를 호출할 수 없다.
    int getMaxNumber(int x, int y);
}
