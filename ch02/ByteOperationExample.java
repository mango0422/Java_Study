package ch02;
public class ByteOperationExample {
    public static void main(String[] args){
        byte result1 = 10 + 20;
        System.out.println(result1);

        byte x = 10;
        byte y = 20;
        //byte result = x + y; //컴파일에러 -> int 타입으로 변환되어 연산되기 때문.
        int result2 = x + y;
        System.out.println(result2);
    }
}

/*
byte x = 10; byte y = 20; int result = x + y;
위와 같이 코드를 컴파일 하는 것 보다, 아래와 같이
int x = 10; int y = 20; int result = x + y;
컴파일 하는 것이 타입변환이 줄면서 실행 성능이 향상될 수 밖에 없다.
*/