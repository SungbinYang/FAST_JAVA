package me.sungbin.ch14.stream.decorator;

import java.io.*;
import java.net.Socket;

public class FileCopy {
    public static void main(String[] args) throws IOException {

        long milliseconds = 0;

        try(FileInputStream fis = new FileInputStream("src/me/sungbin/ch14/stream/decorator/a.zip");
            FileOutputStream fos = new FileOutputStream("src/me/sungbin/ch14/stream/decorator/copy.zip");
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            milliseconds = System.currentTimeMillis();

            int i;
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }

            milliseconds = System.currentTimeMillis() - milliseconds;
        } catch (IOException e) {
            System.out.println(e);
        }

        Socket socket = new Socket();

        BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        isr.readLine();

        System.out.println("시간: " + milliseconds);
    }
}
