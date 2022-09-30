package com.sparta.test01.model;

public class Main {
    public static void main(String[] args) {

        //버스
        Bus bus1 = new Bus(1100);
        Bus bus2 = new Bus(1101);
        System.out.println();
        bus1.passengerBoarding(2);
        System.out.println();
        bus1.oiling(-50);
        System.out.println();
        bus1.oiling(10);
        System.out.println();
        bus1.passengerBoarding(45);
        System.out.println();
        bus1.passengerBoarding(5);
        System.out.println();
        bus1.oiling(-55);

        System.out.println("==========================");
        //택시
        Taxi taxi1 = new Taxi(1);
        System.out.println();
        Taxi taxi2 = new Taxi(2);
        System.out.println();
        taxi1.passengerBoarding(2,"서울역",2);
        System.out.println();
        taxi1.oiling(-80);
        taxi1.passengerBoarding(5,"서울역",2);
        System.out.println();
        taxi1.passengerBoarding(3,"구로디지털단지",12);
        System.out.println();
        taxi1.oiling(-20);




    }
}
