package ch06.sec06.exam06;

public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car();

        //잘못된 속도 변경
        myCar.setSpeed(-50);

        System.out.println("현재 속도: " + myCar.getSpeed());

        //올바른 속도 변경
        myCar.setSpeed(60);

        //멈춤
        if(!myCar.isStop()){
            myCar.setStop(true);
        }

        System.out.println("현재 속도: " +  myCar.getSpeed());
    }
}

/*
 CarExample 클래스의 8라인에서 비정상적인 속도값으로 변경을 시도하지만, speed 필드의 Setter(setSpeed())에서 매개값을 검사한 후 0으로 변경하기 때문에 10라인의 Getter(getSpeed())의 리턴값은 0으로 나온다.
 16라인에서는 stop 필드의 Getter(isStop()) 리턴값이 false일 경우, 자동차를 멈추기 위해 Setter(setStop(true))를 호출해서 stop 필드를 true로, speed 필드를 0으로 변경한다.
 */