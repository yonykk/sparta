package com.company;

import java.io.*;
import java.util.*;

public class Main {
    static int number = 1;

    public static void main(String[] args) {
        System.out.println("///////////bus///////////");
        Bus busA = new Bus();
        Bus busB = new Bus();
        System.out.println("BusA 번호: " + busA.num);
        System.out.println("BusB 번호: " + busB.num);

        System.out.println();

        busA.take(2);
        System.out.println("탑승 승객 수 = " + busA.p);
        System.out.println("잔여 승객 수 = " + (busA.maxP - busA.p));
        System.out.println("요금 확인 = " + busA.getPay());

        System.out.println();

        busA.setOil(-50);
        System.out.println("주유량 = " + busA.oil);

        System.out.println();

        busA.stop();
        busA.setOil(10);
        busA.printState();
        System.out.println("주유량 = " + busA.oil);

        System.out.println();

        busA.start();
        busA.take(45);

        System.out.println();

        busA.take(5);
        System.out.println("탑승 승객 수 = " + busA.p);
        System.out.println("잔여 승객 수 = " + (busA.maxP - busA.p));
        System.out.println("요금 확인 = " + busA.getPay());

        System.out.println();

        busA.setOil(-55);
        System.out.println("주유량 = " + busA.oil);
        busA.printState();


        System.out.println();

        System.out.println("///////////taxi///////////");

        Taxi taxiA = new Taxi();
        Taxi taxiB = new Taxi();
        System.out.println("TaxiA 번호: " + taxiA.num);
        System.out.println("TaxiB 번호: " + taxiB.num);
        System.out.println("주유량 = " + taxiA.oil);
        taxiA.printState();

        System.out.println();

        taxiA.setGoal("서울역", 2);

        System.out.println("탑승 승객 수 = " + taxiA.p);
        System.out.println("잔여 승객 수 = " + (taxiA.maxP - taxiA.p));
        System.out.println("기본 요금 확인 = " + taxiA.pay);
        System.out.println("목적지 = " + taxiA.goal);
        System.out.println("목적지까지 거리 = " + taxiA.desD + "km");
        System.out.println("지불할 요금 = " + taxiA.totalPay());
        taxiA.printState();

        System.out.println();

        taxiA.setOil(-80);
        taxiA.payment();
        System.out.println("주유량 = " + taxiA.oil);
        System.out.println("누적 요금 = " + taxiA.total);

        System.out.println();

        taxiA.take(5);

        System.out.println();

        taxiA.take(3);
        taxiA.setGoal("구로디지털단지역", 12);

        System.out.println("탑승 승객 수 = " + taxiA.p);
        System.out.println("잔여 승객 수 = " + (taxiA.maxP - taxiA.p));
        System.out.println("기본 요금 확인 = " + taxiA.pay);
        System.out.println("목적지 = " + taxiA.goal);
        System.out.println("목적지까지 거리 = " + taxiA.desD + "km");
        System.out.println("지불할 요금 = " + taxiA.totalPay());

        System.out.println();

        taxiA.setOil(-20);
        taxiA.payment();
        System.out.println("주유량 = " + taxiA.oil);
        taxiA.printState();
        System.out.println("누적 요금 = " + taxiA.total);


    }
}