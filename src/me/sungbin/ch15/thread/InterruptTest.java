package me.sungbin.ch15.thread;

public class InterruptTest extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i ++) {
            System.out.println(i);
        }

        try {
            sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
            System.out.println("wait");
        }
    }

    public static void main(String[] args) {

        InterruptTest test = new InterruptTest();
        test.start();

        test.interrupt();
        System.out.println("end");
    }
}
