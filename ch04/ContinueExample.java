package ch04;

public class ContinueExample {
    public static void main(String[] args){
        for(int i=1; i<=10; i++){
            if(i%2 !=0){
                continue;
            }
            System.out.println(i);
        }
    }
}

/*
continue문은 반복문인 for문, while문, do-while문에서만 사용되는데, 블록 내부에서 continue문이 실행되면 for문의 증감식 또는 while문, do-while문의 조건식으로 이동한다.
continue문은 반복문을 종료하지 않고 계속 반복을 수행한다는 점이 break 문과 다르다.
break문과 마찬가지로 continue문도 대개 if문과 같이 사용되는데, 특정 조건을 만족하는 경우에 continue문을 실행해서 그 이후의 문장을 실행하지 않고 다음 반복으로 넘어간다.
*/