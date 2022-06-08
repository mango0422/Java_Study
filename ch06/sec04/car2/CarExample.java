package ch06.sec04.car2;

public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.keyTurnOn();
        myCar.run();
        int speed = myCar.getSpeed();
        System.out.println("현재속도: " + speed + "km/h");
    }
}
