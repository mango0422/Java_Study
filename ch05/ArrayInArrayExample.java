package ch05;

public class ArrayInArrayExample {
    public static void main(String[] args){
        
        int[][] mathScores = new int[2][3];
        for(int i=0; i<mathScores.length; i++){
            for(int k=0; k<mathScores[i].length; k++){
                System.out.printf("mathscores[" + i + "][" + k + "] = " + mathScores[i][k] + "\n");
            }
        }

        int[][] englishScores = new int[2][];
        englishScores[0] = new int[2];
        englishScores[1] = new int[3];
        for(int i=0; i<englishScores.length; i++){
            for(int k=0; k<englishScores[i].length; k++){
                System.out.printf("englishScores[" + i + "][" + k + "] = " + englishScores[i][k] + "\n");
            }
        }

        int[][] javaScores = { {95, 80}, {92, 96, 80} };
        for(int i=0; i<javaScores.length; i++){
            for(int k=0; k<javaScores[i].length; k++){
                System.out.printf("javaScores[" + i + "][" + k + "] = " + javaScores[i][k] + "\n");
            }
        }
    }
}

/*
기본 타입(byte, char, short, int, long, float, double, boolean) 배열은 각 항목에 직접 값을 갖고 있지만, 참조 타입(클래스, 인터페익스) 배열은 각 항목에 객체의 번지를 가지고 있다.
예를 들어 String은 클래스이므로 String[] 배열은 각 항목에 문자열이 아니라, String 객체의 번지를 가지고 있다.
즉 String[] 배열은 String 객체를 참조하게 된다.
String[] 배열의 항목도 결국 String 변수와 동일하게 취급되어야 한다.
예를 들어 string[] 배열 항목 간에 문자열을 비교하기 위해서는 == 연산자 대신 equals() 메소드를 사용해야 한다.
==는 객체의 번지를 비교하기 때문에 문자열을 비교하는 데는 사용할 수 없다.
*/