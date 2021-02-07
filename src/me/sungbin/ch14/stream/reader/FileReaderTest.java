package me.sungbin.ch14.stream.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws IOException {

        FileReader fis = new FileReader("src/me/sungbin/ch14/stream/reader/reader.txt");
        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();
    }
}
