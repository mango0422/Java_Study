package ch06.sec04;

public class Computer {
    int sum1(int[] values){
        int sum = 0;
        for(int i = 0; i<values.length; i++){
            sum += values[i];
        }
        return sum;
    }

    int sum2(int ... values){
        int sum = 0;
        for(int i=0; i<values.length; i++){
            sum += values[i];
        }
        return sum;
    }
}

/*
 * sum1()과 sum2() 메소드의 실행문이 완전 일치하는 것을 볼 수 있다.
 * 매개 변수의 선언 방법만 다를 뿐, 매개 변수의 타입이 배열이므로 처리 내용이 같을 수 밖에 없다.
 */