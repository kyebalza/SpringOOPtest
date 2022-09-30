package com.sparta.test01.model;

public class Bus extends Vehicle{

    private int currentPassenger;//현재승객수
    private String state;//상태
    private int fare;//요금
    private int busNumber;//버스번호

    private int busMaximumPassenger;//버스 최대승객 수(이거 부모클래스에서 불러올 방법 생각해보기)

    private int currentFuel_volume;//현재 연료량

    private int speed;//속도

    //기본생성자 만드는 이유 => 기본값을 지정해줄 때
    public Bus(int busNumber){
        this.start(busNumber);//버스number가 먼저 선언되면 구지 매개변수로 안가져와도됨
        this.busNumber = busNumber;//버스번호

        this.state ="운행중";
        this.fare =1000;
        super.setMaximumPassenger(30);//최대승객수?
        busMaximumPassenger = super.getMaximumPassenger();//버스 최대승객수
        currentFuel_volume=super.getFuel_volume();
        this.speed = super.getSpeed();
    }


    //기능
    //1. 번호 확인
    public void number_comparison(int a){
        System.out.println("차량번호는 : "+this.busNumber);
    }

    public void start(int busNumber){
        System.out.println(busNumber+"번 버스 운행 시작!");
    }

    //2. 승객 탑승
    public void passengerBoarding(int passenger){

        currentPassenger += passenger;
        //this.currentPassenger += passenger;
        if (currentPassenger <=30 && state.equals("운행중")){
            busMaximumPassenger -= passenger;
            //this.busMaximumPassenger -= passenger;
            fare = fare*passenger;
            System.out.println("탑승 승객 수 = "+currentPassenger);
            System.out.println("잔여 승객 수 = "+busMaximumPassenger);
            System.out.println("요금 확인 = "+fare);
            //초기화
            fare=1000;
        }else{
            //currentPassenger -= passenger;//이전으로 승객 수 초기화
            currentPassenger = 0;//0으로 승객 수 초기화
            System.out.println("최대승객 수 초과");//alert으로 바꾸기
        }
    }

    public void oiling(int oil){
        if (oil>=0){//주유 시 차고지행
            state ="차고지행";
            System.out.println("상태 : "+state);
        }
        currentFuel_volume += oil;
        System.out.println("주유량 "+currentFuel_volume);


        if (currentFuel_volume<10){//연료가 10미만일 때
            System.out.println("주유 필요");
            System.out.println("주유량을 확인해주세요");
            state ="차고지행";

        }else {
            state="운행중";
        }
    }

    public void speedChange(int speedChange){
        speed += speedChange;
    }


}
