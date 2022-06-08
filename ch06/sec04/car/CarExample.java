package ch06.sec04.car;

public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car();

        myCar.setGas(5);

        boolean gasState = myCar.isLeftgas();
        if(gasState){
            System.out.println("출발합니다.");
            myCar.run();
        }
        if(myCar.isLeftgas()){
            System.out.println("gas를 주입할 필요가 없습니다.");
        } else{
            System.out.println("gas를 주입하세요.");
        }
    }
}

/*
 CarExample 클래스는 다음과 같이 실행된다.
 * 7라인에서 Car 객체의 setGas(5) 메소드를 호출해서 Car 객체의 gas 필드값을 5로 변경했다.
 * 9라인에서는 isLeftGas() 메소드를 호출해서 리턴값을 gasState 변수에 저장한다.
 * 10라인에서 gasState 변수값이 true일 경우 12라인에서 run() 메소드를 호출한다.
 * 15라인을 보면 if문의 조건식으로 isLeftGas() 메소드 호출이 들어가 있는데, 이것이 가능한 이유는 isLeftGas() 메소드가 boolean 값을 리턴하기 때문이다.
   리턴값이 true일 경우 if 블록을 실행하고, false일 경우 else 블록을 실행한다.
 */