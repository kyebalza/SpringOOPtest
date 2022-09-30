package com.sparta.test01.model;

public class Taxi extends Vehicle{
    private int currentPassenger;//현재승객수
    private String state;//상태
    private int defaultFare;//기본요금
    private int farePerDistance;//거리당 요금
    private int defaultDistance;//기본 거리

    private int taxiNumber;//택시 번호

    private int taxiMaximumPassenger;//버스 최대승객 수(이거 부모클래스에서 불러올 방법 생각해보기)

    private int currentFuel_volume;//현재 연료량

    private String goal;//목적지

    private int goal_distance;//목적지까지 거리

    private int pay_money;//지불할 요금

    private int accumulated_fee;//누적요금

    private int speed;//속도


    public Taxi(int taxiNumber){
        super();//부모의 모든 것 불러옴(주유량, 속도)
        super.setMaximumPassenger(4);//최대 승객수
        taxiMaximumPassenger = getMaximumPassenger();//최대승객수
        this.defaultFare=3000;//기본 요금
        this.farePerDistance=1000;//거리당 요금
        this.defaultDistance=1;//기본 거리
        currentFuel_volume = super.getFuel_volume();//주유량
        this.state="일반";
        this.taxiNumber = taxiNumber;
        this.speed = super.getSpeed();
        start();
    }

    //초기
    public void start(){
        if (currentFuel_volume < 10){
            state ="운행불가";
            System.out.println("상태 ="+state);
        }else {
            System.out.println(taxiNumber+"번 택시 운행 시작!");
            System.out.println("주유량 = "+currentFuel_volume);
            System.out.println("상태="+state);

        }
    }

    public void passengerBoarding(int passenger, String goal, int goal_distance) {
        currentPassenger += passenger;
        if (currentPassenger <= 4 && state.equals("일반")){
            System.out.println("탑승 승객 수 = "+passenger);
            taxiMaximumPassenger -= passenger;//잔여 승객 수
            System.out.println("잔여 승객 수 = "+taxiMaximumPassenger);
            System.out.println("기본요금확인 = "+defaultFare);
            System.out.println("목적지 = "+goal );
            System.out.println("목적지까지 거리 = "+goal_distance+"km" );
            if (goal_distance > 1){
                pay_money = defaultFare+((goal_distance-1)*farePerDistance);
                accumulated_fee += defaultFare+((goal_distance-1)*farePerDistance);//누적요금
            }else {
                pay_money = defaultFare;
                accumulated_fee += defaultFare;//누적요금
            }
            System.out.println("지불할 요금 = "+pay_money );
            state="운행중";
            System.out.println("상태 = "+state);


        }else {
            currentPassenger =0;
            System.out.println("최대승객 수 초과");
        }
    }

    public void oiling(int oil){
        currentFuel_volume += oil;
        if(currentFuel_volume<=0){
            state ="운행불가";
            System.out.println("상태 = "+state);
            System.out.println("누적요금 = "+accumulated_fee+"원");
            System.out.println("주유필요");
        }else {
            if(oil<0){//하차
                System.out.println("주유량 = "+currentFuel_volume);
                System.out.println("누적요금 = "+accumulated_fee+"원");

            }else {

            }
        }
        //초기화
        state="일반";
        pay_money=0;
        currentPassenger=0;
        taxiMaximumPassenger=4;

    }

    public void speedChange(int speedChange){
        speed += speedChange;
    }



}
