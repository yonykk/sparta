package com.company;

public class PublicTransport {
    int num; //고유 번호
    int oil; //기름량
    int speed; //속도
    int changeSpeed; //가속
    int maxP; //최대 승객
    int p; // 현재 승객
    int state; //운행 상태
    int pay; //요금

    static int number = 1;

    //생성자
    public PublicTransport(){
        oil = 100;
        speed = 0;
        state = 1;
        num = number;
        number++;
    }

    //변속. 운행중이고 기름이 10 이상 있어야 가능하다.
    public void changeSpeed(int n){
        if(state != 1 && oil < 10){
            System.out.println("주유량을 확인해주세요");
            return;
        }
        speed += n;
        if(speed < 0)
            speed = 0;
    }

    //운행 시작. 기름량 확인 후 활성화한다.
    public void start() {
        if(oil < 10)
            System.out.println("주유가 필요합니다");
        else
            state = 1;
    }

    //운행 종료. 승객의 수도 0으로 초기화한다.
    public void stop(){
        state = 0;
        p = 0;
    }

    //승객 탑승. 운행중인 상태에서만 가능
    public void take(int n){
        if(n+p > maxP)
            System.out.println("최대 승객 수 초과");
        else if(state == 1)
            p += n;
    }

    //오일 추가 및 사용. 10 이하면 경고메시지 출력 및 운행 종료
    public void setOil(int n){
        oil += n;
        if(oil < 10){
            System.out.println("주유가 필요합니다");
            stop();
            if(n < 0) //음수가 되면 0으로 초기화
                n = 0;
        }
    }
}
