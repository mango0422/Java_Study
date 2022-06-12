package ch07.sec01.exam04;

public class SupersonicAirplane extends Airplane{
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly(){
        if(flyMode == SUPERSONIC){
            System.out.println("초음속비행합니다.");
        } else{
            super.fly();
        }
    }
}

/*
 SupersonicAirplane의 4~5라인은 상수를 선언했다.
 자주 사용되는 고정값들은 상수를 사용함으로써 가독성을 높여준다.

 10라인에서 fly() 메소드가 재정의되었다.
 flyMode가 SUPERSONIC 상수값을 가질 경우에는 "초음속비행합니다."를 출력하지만, 그렇지 않을 경우에는 부모인 Airplane의 fly() 메소드를 호출하기 위해 super.fly()를 사용하였다.
 */