package me.sungbin.ch06.array;

public class CharTest {
    public static void main(String[] args) {

        char[] alphabet = new char[26];
        for (int i=0, n=65; i < alphabet.length; i++, n++) {
            alphabet[i] = (char) n;
            System.out.println(alphabet[i] + "," + (int) alphabet[i]);
        }
    }
}
