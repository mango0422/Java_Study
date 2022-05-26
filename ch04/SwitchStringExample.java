package ch04;

public class SwitchStringExample {
    public static void main(String[] args){
        String position = "과장";

        switch(position){
            case "부장":
                System.out.println("부장님 월급은 700만원입니다.");
                break;
            case "과장":
                System.out.println("과장님 월급은 500만원입니다.");
                break;
            default:
                System.out.println("평사원 월급은 300만원입니다.");
        }
    }
}
