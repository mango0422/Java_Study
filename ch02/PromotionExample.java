package ch02;
public class PromotionExample {
    public static void main(String[] args){
        byte bytevalue = 10;
        int intValue = bytevalue;
        System.out.println("intValue: " + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드: " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue: " + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue: " + floatValue);
        
        floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println("doubleValue: " + doubleValue);
    }
}

/*
자동 타입 변환 (promotion)은 말 그대로 자동으로 타입 변환이 일어나는 것 의미.
허용 범위가 작은 타입이 허용 범위가 큰 타입으로 저장될 때 발생.

기본 타입을 허용 범위 크기순으로 정리하면 다음과 같다.
byte < short < int < long < float < double

예외 ) char 타입보다 허용 범위가 작은 byte 타입은 char 타입으로 자동 타입 변환될 수 없다.
char 타입의 허용 범위는 음수를 포함하지 않는데, byte 타입은 음수를 포함하기 때문이다.
*/