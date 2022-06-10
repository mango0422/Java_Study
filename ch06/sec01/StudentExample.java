package ch06.sec01;

public class StudentExample {
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다.");

        Student s2 = new Student();
        System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
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
______________________________________________________________________________________________________________

StudentExample을 실행하면 메모리에 클래스 변수와 객체가 생성된다.
Student 클래스는 하나지만 new 연산자를 사용한 만큼 객체가 메모리에 생성된다. 이러한 객체들은 Student 클래스의 인스턴스이다.
비록 같은 클래스로부터 생성되었지만 각각의 Student 객체는 자신만의 고유 데이터를 가지면서 메모리에서 활동하게 된다.
s1과 s2가 참조하는 Student 객체는 완전히 독립된 서로 다른 객체이다.
*/