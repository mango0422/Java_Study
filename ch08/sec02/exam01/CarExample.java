package ch08.sec02.exam01;

public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car();

        myCar.run();

        myCar.frontLeftTire = new KumhoTire();
        myCar.frotnRightTire = new KumhoTire();

        myCar.run();
    }
}
