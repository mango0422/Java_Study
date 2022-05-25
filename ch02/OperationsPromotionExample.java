package ch02;
public class OperationsPromotionExample {
    public static void main(String[] args){
        byte byteValue1 = 10;
        byte byteValue2 = 20;
        //byte byteValue3 = byteValue1 + byteValue2; ← 컴파일 에러
        int intValue1 = byteValue1 + byteValue2;
        System.out.println(intValue1);

        char charValue1 = 'A';
        char charValue2 = 1;
        //char charValue3 = charValue1 + charValue2; ← 컴파일 에러
        int intValue2 = charValue1 + charValue2;
        System.out.println("유니코드=" + intValue2);
        System.out.println("출력문자=" + (char)intValue2);

        int intValue3 = 10;
        int intValue4 = intValue3/4;
        System.out.println(intValue4);

        int intValue5 = 10;
        //int intValue6 = 10 / 4.0;
        double doubleValue = intValue5 / 4.0;
        System.out.println(doubleValue);

        int x = 1;
        int y = 2;
        double result = (double) x / y;
        System.out.println(result);
    }
}
/*
실수 연산에서의 자동 타입 변환
실수 타입 변수가 산술 연산식에서 피연산자로 사용될 경우 두 피연산자가 동일한 타입이라면 해당 타입으로 연산되지만, 피연산자 중 하나가 double 타입이라면 다른 피연산자도 double 타입으로 자동 타입 변환되어 연산을 수행한다.
따라서 연산 결과는 double 타입이 된다.
int 타입과 double 타입을 연산해도 동일한 과정을 거친다.
먼저 int 타입의 피연산자가 double 타입으로 자동 변환되고 연산을 수행한다.
만약 꼭 int 타입으로 연산을 해야 한다면 double 타입을 int 타입으로 강제 변환하고 덧셈 연산을 수행하면 된다.
*/