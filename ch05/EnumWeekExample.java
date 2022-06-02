package ch05;

import java.util.Calendar;

public class EnumWeekExample {
    public static void main(String[] args){
        Week today = null;

        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch(week){
            case 1:
                today = Week.SUNDAY; break;
            case 2:
                today = Week.MONDAY; break;
            case 3:
                today = Week.TUESDAY; break;
            case 4:
                today = Week.WEDNESDAY; break;
            case 5:
                today = Week.THURDAY; break;
            case 6:
                today = Week.FRIDAY; break;
            case 7:
                today = Week.SATURDAY; break;
            }
        System.out.println("오늘 요일: " + today);

        if(today == Week.SUNDAY){
            System.out.println("일요일에는 축구를 합니다.");
        }
        else{
            System.out.println("열심히 자바 공부합니다.");
        }
    }
}


/*
열거 타입 변수를 선언했다면 열거 상수를 저장할 수 있다.
열거 상수는 단독으로 사용할 수 없고 반드시 '열거 타입.열거 상수' 형태로 사용된다.
예를 들어 today 열거 타입 변수에 열거 상수인 SUNDAY를 저장하면 다음과 같다.
Week today = Week.SUNDAY;
열거 타입 변수는 null 값을 저장할 수 있는데 열거 타입도 참조 타입이기 대문이다.
Week burtday = null;

참조 타입 변수는 객체를 참조하는 변수라고 알고 있는데, 열거 상수는 열거 객체로 생성된다.
열거 타입 변수 Week의 경우 MONDAY부터 SUNDAY까지의 열거 상수는 다음과 같이 총 7개의 Week 객체로 생성된다.
그리고 메소드 영역에 생성된 열거 상수가 해당 Week 객체를 각각 참조하게 된다.

Week today = Week.SUNDAY;의 경우,
열거 타입 변수 today는 스택 영역에 생성되고, today에 저장되는 값은 Week.SUNDAY 열거 상수가 참조하는 객체의 번지이다.
따라서 열거 상수 Week.SUNDAY와 today 변수는 서로 같은 Week 객체를 참조하게 된다.
그렇기 때문에 today 변숟와 Week.SUNDAY 상수의 == 연산 결과는 true가 된다.
*/