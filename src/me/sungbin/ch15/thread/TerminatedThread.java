package me.sungbin.ch15.thread;

import java.io.IOException;

public class TerminatedThread extends Thread{

    private boolean flag = false;
    int i;

    public TerminatedThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (!flag) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " end");
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public static void main(String[] args) throws IOException {

        TerminatedThread threadA = new TerminatedThread("A");
        TerminatedThread threadB = new TerminatedThread("B");

        threadA.start();
        threadB.start();

        int in;
        while (true) {
            in = System.in.read();
            if (in == 'A') {
                threadA.setFlag(true);
            } else if (in == 'B'){
                threadB.setFlag(true);
            } else if (in == 'M') {
                threadA.setFlag(true);
                threadB.setFlag(true);
                break;
            } else {
                System.out.println("try again");
            }
        }
        System.out.println("main end");
    }
}
