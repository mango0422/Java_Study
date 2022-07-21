package ch08.sec02.exam04;

public class Driver {
    public void drive(Vehicle vehicle){ // vehicle 자리에는 Bus 객체나 Taxi 객체가 들어갈 수 있다.
        if(vehicle instanceof Bus){ // vehicle 매개 변수가 참조하는 객체가 Bus인지 조사
            Bus bus = (Bus) vehicle; // Bus 객체일 경우 안전하게 강제 타입 변환
            bus.checkFare(); // Bus 타입으로 강제 타입 변환을 하는 이유
        }
        vehicle.run();
    }
}
