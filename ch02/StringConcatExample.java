package ch02;
public class StringConcatExample {
    public static void main(String[] args){
        int value = 10 + 2 + 8;
        System.out.println("value: " + value);

        //문자열 결합 연산
        String str1 = 10 + 2 + "8";
        System.out.println("str1: " + str1);

        String str2 = 10 + "2" + 8;
        System.out.println("str2: " + str2);

        String str3 = "10" + 2 + 8;
        System.out.println("str3: " + str3);

        String str4 = "10" + (2 + 8);
        System.out.println("str4: " + str4);
    }
}

/*
자바에서 + 연산자는 두 가지 기능을 가지고 있다.
피연산자가 모두 숫자일 경우에는 덧셈 연산을 수행하지만, 피연산자 중 하나가 문자일 경우에는 나머지 피연산자도 문자열로 자동 변환되어 문자열 결합 연산을 수행한다.
연산식에서 + 연산자가 연이어 나오면 앞에서부터 순차적으로 + 연산을 수행한다.
먼저 수행된 연산이 덧셈연산이라면 덧셈 결과를 가지고 그다음 + 연산을 수행한다.
만약 먼저 수행된 연산이 결합연산이라면 이후 + 연산은 모두 결합 연산이 된다.
*/