package ch04;

public class WhileSumFrom1To100Example {
    public static void main(String[] args){
        int sum = 0;

        int i = 1;
        while(i<=100){
            sum += i;
            i++;
        }
        System.out.println("1~" + (i-1) + " 합 : " + sum);
    }
}

/*
do-while문은 조건식에 의해 반복 실행한다는 점에서 while문과 동일하다.
while문은 시작할 때부터 조건식을 검사하여 블록 내부를 실행할지 결정하지만, 경우에 따라서는 블록 내부의 실행문을 우선 실행하고 실행결과에 따라서 반복 실행을 계속할지 결정할 수도 있다.
이때 do-while문을 사용할 수 있다.

1.실행문을 우선 실행한다.
2.실행문이 모두 실행되면 조건식을 평가한다.
3.조건식이 참이면 실행문을 다시 실행하고, 조건식이 거짓이면 do-while문을 종료한다.
*/