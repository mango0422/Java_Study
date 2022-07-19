package ch08.sec02.exam01;

public class Car {
    Tire frontLeftTire = new HankookTire();
    Tire frotnRightTire = new HankookTire();
    Tire backLeftTire = new HankookTire();
    Tire backRightTire = new HankookTire();

    void run(){
        frontLeftTire.roll();
        frotnRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }
}
