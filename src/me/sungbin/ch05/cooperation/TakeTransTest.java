package me.sungbin.ch05.cooperation;

public class TakeTransTest {
    public static void main(String[] args) {

        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Tomas", 10000);
        Student studentE = new Student("Edward", 10000);

        Bus bus100 = new Bus(100);
        Subway subwayGreen = new Subway(2);
        Taxi taxi = new Taxi(1458);

        studentJ.takeBus(bus100);
        studentT.takeSubway(subwayGreen);
        studentE.takeTaxi(taxi);

        studentJ.showInfo();
        studentT.showInfo();
        studentE.showInfo();

        bus100.showBusInfo();
        subwayGreen.showSubwayInfo();
        taxi.showTaxiInfo();
    }
}
