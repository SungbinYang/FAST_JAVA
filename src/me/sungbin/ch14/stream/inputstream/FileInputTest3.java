package me.sungbin.ch14.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest3 {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("src/me/sungbin/ch14/stream/inputstream/input2.txt")) {
            int i;
            byte[] bs = new byte[10];
            while ((i = fis.read(bs)) != -1) {
                /* for (byte b : bs) {
                    System.out.print((char) b); // garbage 발생할수도 있음
                } */
                for (int k = 0; k < i; k ++) {
                    System.out.print((char) bs[k]);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // System.out.println("end");
    }
}
