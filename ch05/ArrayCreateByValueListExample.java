package ch05;

public class ArrayCreateByValueListExample {
    public static void main(String[] args){
        int[] scores = { 83, 90, 87 };

        System.out.println("scores[0] : " + scores[0]);
        System.out.println("scores[1] : " + scores[1]);
        System.out.println("scores[2] : " + scores[2]);

        int sum = 0;
        for(int i=0; i<3; i++){
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);
        double avg = (double) sum / 3;
        System.out.println("평균 : " + avg);
    }
}

/*
값의 목록으로 배열 객체를 생성할 때 주의할 점이 있는데, 배열 변수를 이미 선언한 후에는 다른 실행문에서 중괄호를 사용한 배열 생성이 허용되지 않는다.
배열 변수를 미리 선언한 후 값 목록들이 나중에 결정되는 상황이라면 다음과 같이 new 연산자를 사용해서 값 목록을 지정해주며 노딘다.
new 연산자 바로 뒤에는 배열 변수 선언에서 사용한 "타입[]"를 붙여주고 중괄호 {}안에는 값들을 나열해준다.

String[] names = null;
names = new String[] { "신용권", "홍길동", "감자바"};

메소드의 매개값이 배열일 경우에도 마찬가지다.
아래와 같이 매개 변수로 int[] 배열이 선언된 add() 메소드가 있을 경우, 값 목록으로 배열을 생성함과 동시에 add() 메소드의 매개값으로 사용하고자 할 때는 반드시 new 연산자를 사용해야 한다.

int add(int[] scores){ ... }
int result = add( {95, 85, 90} ); <----- 컴파일 에러
int result = add( new int[]{ 95, 85, 90 });
*/