package ch07.sec01.exam03;

public class ComputerExample {
    public static void main(String[] args){
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.printf("원면적 : " + calculator.areaCircle(r) + "\n\n");

        Computer computer = new Computer();
        System.out.println("원면적 : " + computer.areaCircle(r));   // 재정의된 메소드 호출
    }
}
