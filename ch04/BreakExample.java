package ch04;

public class BreakExample {
    public static void main(String[] args){
        while(true){
            int num = (int)(Math.random()*6) + 1;
            System.out.println(num);
            if(num==6){
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}

/*
break문은 반복문인 for문, while문, do-while문의 실행을 중지할 때 사용된다.
또한, 이전에 학습한 switch문에서도 break문을 사용하여 switch문을 종료한다.
*/