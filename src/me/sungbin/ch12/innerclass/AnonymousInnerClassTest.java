package me.sungbin.ch12.innerclass;

class Outers {

    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i) {
        int num = 100;
        return new Runnable() {
            @Override
            public void run() {
                System.out.println(num);
                System.out.println(i);
                System.out.println(outNum);
                System.out.println(Outers.sNum);
            }
        };
    }

    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("test");
        }
    };
}

public class AnonymousInnerClassTest {
    public static void main(String[] args) {

        Outers outers = new Outers();
        outers.runner.run();
        Runnable runnable = outers.getRunnable(50);

        runnable.run();
    }
}
