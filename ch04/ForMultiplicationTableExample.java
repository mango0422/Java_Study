package ch04;

public class ForMultiplicationTableExample {
    public static void main(String[] args){
        for (int m=2; m<=9; m++){
            System.out.println("*** " + m + "단 ***");
            for(int n=1; n<=9; n++){
                System.out.println(m + "x " + n + " = " + (m*n));
            }
        }
    }
}

/*
for문은 또 다른 for문을 내포할 수 있는데, 이것을 중첩 for문이라고 한다.
이 경우 바깥쪽 for문이 한 번 실행할 때마다 중첩된 for문은 지정된 횟수만큼 반복해서 돌다가 다시 바깥쪽 for문으로 돌아간다.
*/