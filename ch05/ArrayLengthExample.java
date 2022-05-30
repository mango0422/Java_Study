package ch05;

public class ArrayLengthExample {
    public static void main(String[] args){
        int[] scores = { 83, 90, 87 };

        int sum = 0;
        for(int i=0; i<3; i++){
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("평균 : " + avg);
    }
}

/*

배열의 길이란 배열에 저장할 수 있는 전체 항목의 개수를 말한다.
코드에서 배열의 길이를 얻으려면 다음과 같이 배열 객체의 length 필드를 읽는다.
참고로 필드는 객체 내부의 데이터를 말한다.
배열의 length 필드를 읽기 위해서는 배열 변수에 도트(.)연산자를 붙이고 length를 적어주면 된다.

*/