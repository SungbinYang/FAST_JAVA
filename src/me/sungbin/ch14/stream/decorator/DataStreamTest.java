package me.sungbin.ch14.stream.decorator;

import java.io.*;

public class DataStreamTest {
    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("src/me/sungbin/ch14/stream/decorator/data.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            FileInputStream fis = new FileInputStream("src/me/sungbin/ch14/stream/decorator/data.txt");
            DataInputStream dis = new DataInputStream(fis)) {

            dos.writeByte(100);
            dos.write(100);
            dos.writeChar('A');
            dos.writeUTF("안녕하세요");

            System.out.println(dis.readByte());
            System.out.println(dis.read());
            System.out.println(dis.readChar());
            System.out.println(dis.readUTF());

        } catch (IOException ignored) {

        }

    }
}
