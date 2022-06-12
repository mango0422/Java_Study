package ch07.sec01.exam03;

public class Computer extends Calculator {
    @Override
    double areaCircle(double r){
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}

/*
 Calculato의 areaCircle() 메소드는 파이의 값을 3.14159로 계산하였지만, 좀 더 정밀한 계산을 위해 Computer의 areaCircle() 메소드는 Math.PI 상수를 이용하였다.
 Math는 수학 계산과 관련된 필드와 메소드들을 가지고 있는 클래스로, 자바 표준 API이다.

 Computer에서 4라인의 @Override 어노테이션은 생략해도 좋으나, 이것을 붙여주면 areaCircle() 메소드가 정확히 재정의된 것인지 컴파일러가 확인하기 때문에 개발자의 실수를 줄여준다.
 예를 들어, 개발자가 areaCircl()처럼 끝에 e를 빼먹으면 컴파일 에러가 발생한다.
 */