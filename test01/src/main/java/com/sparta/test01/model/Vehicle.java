package com.sparta.test01.model;

public class Vehicle {

    private int fuel_volume;//주유량(기본값)
    private int speed;//속도(기본값)
    private int number;//번호
    private int speedChange;//속도변경
    private int maximumPassenger;//최대승객수


    //기본값 설정
    public Vehicle() {
        this.fuel_volume = 100;
        this.speed = 0;
    }

    //게터 세터
    public int getFuel_volume() {
        return fuel_volume;
    }

    public void setFuel_volume(int fuel_volume) {
        this.fuel_volume = fuel_volume;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSpeedChange() {
        return speedChange;
    }

    public void setSpeedChange(int speedChange) {
        this.speedChange = speedChange;
    }

    public int getMaximumPassenger() {
        return maximumPassenger;
    }

    public void setMaximumPassenger(int maximumPassenger) {
        this.maximumPassenger = maximumPassenger;
    }

    //메서드
    //운행시작
    public void start(){
        System.out.println("운행 시작!");
    }
    //속도 변경
    public void speedChange(){

    }
    //상태 변경
    public void stateChange(){

    }
    //승객 탑승
    public void passengerBoarding(){

    }



}
