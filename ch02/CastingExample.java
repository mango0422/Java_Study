package ch02;
public class CastingExample {
    public static void main(String[] args){
        int intValue = 44032;
        char charValue = (char) intValue;
        System.out.println(charValue);

        long longValue = 500;
        intValue = (int) longValue;
        System.out.println(intValue);

        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println(intValue);
    }
}

/*
큰 허용 범위 타입은 작은 허용 범위 타입으로 자동 타입 변환될 수 없지만, 강제로 나눠서 저장할 수 있는데, 이를 강제 타입 변환(Casting)이라고 한다.
강제 타입 변환은 캐스팅 연산자 괄호 ()를 사용하는데, 괄호 안에 들어가는 타입은 나누는 단위이다.
작은 허용 범위 타입 = (작은 허용 범위 타입) 큰 허용 범위 타입
*/