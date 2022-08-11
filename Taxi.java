package com.company;

public class Taxi extends PublicTransport{

    int des; // 기본 거리
    int desD; //목적지까지 거리
    String goal; //목적지
    int addPay; //추가요금. pay는 기본요금
    int total; //누적요금

    //생성자
    public Taxi(){
        maxP = 4; //최대 탑승인원
        pay = 3000; //기본 요금 설정
        addPay = 1000;//거리 당 추가 요금 설정
        des = 1;//기본 요금 거리 설정
    }

    //목적지 및 목적지와의 거리 셋팅
    public void setGoal(String s, int d){
        goal = s;
        desD = d;
        state = 2; //일반에서 운행중으로 바꿈
    }

    public void changeState(int change){
        if(change != 0) { //운행정지 상태가 아닐 때
            if(oil < 10) {
                state = 0; //기름이 없으면 운행 불가
                System.out.println("주유가 필요합니다"); //경고 메시지 출력
                return;
            }
            state = change;
        }
        else
            state = 0;

    }

    //현재 승객의 총 금액 반환
    public int totalPay(){
        int n = pay;
        if(desD - des > 0)
            n += (desD - des)*addPay;
        return n;
    }

    //현재 운행 상태 출력
    public void printState(){
        if(state == 1)
            System.out.println("상태 = 일반");
        else if(state == 2)
            System.out.println("상태 = 운행중");
        else
            System.out.println("상태 = 운행불가");
    }

    //결제하기. 운행 전 상태로 초기화한다.
    public void payment(){
        total += totalPay(); //누적 요금 갱신
        state = 1; //일반 상태로 전환
        if(oil < 10) //기름이 부족하면 운행 불가
            stop();
        //목적지 및 승객 초기화
        p = 0;
        desD = 0;
        goal = "";
    }
}

