package com.company;

public class Bus extends PublicTransport {
    //생성자
    public Bus(){
        maxP = 30;
        pay = 1000;
    }

    //현재 운행 상태 출력
    public void printState(){
        if(state == 1)
            System.out.println("상태 = 운행");
        else
            System.out.println("상태 = 차고지행");
    }

    //승객 수에 따른 요금 출력
    public int getPay(){
        return p*pay;
    }

}
