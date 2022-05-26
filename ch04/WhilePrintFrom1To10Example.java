package ch04;

public class WhilePrintFrom1To10Example {
    public static void main(String[] args){
        int i = 1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
    }
}

/*
for문이 정해진 횟수만큼 반복한다면, while문은 조건식이 true일 경우에 계속해서 반복한다.
조건식에는 비교 또는 논리 연산식이 주로 오는데, 조건식이 false가 되면 반복 행위를 멈추고 while문을 종료한다.
*/