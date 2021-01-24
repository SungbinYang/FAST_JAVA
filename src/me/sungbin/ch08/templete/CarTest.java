package me.sungbin.ch08.templete;

public class CarTest {
    public static void main(String[] args) {

        Car aiCar = new AICar();
        aiCar.run();
        System.out.println("============================");
        Car manualCar = new ManualCar();
        manualCar.run();
    }
}
