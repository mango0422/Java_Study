package ch05;

import java.util.Scanner;

public class Exercises06 {
    public static void main(String[] args){
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);

        while(run){
            System.out.println("--------------------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------------------------------");
            System.out.print("선택> ");

            int selectNo = Integer.parseInt(scanner.nextLine());

            if(selectNo == 1){
                System.out.print("학생수> ");
                studentNum = Integer.parseInt(scanner.nextLine());
                scores = new int[studentNum];
            }
            else if(selectNo == 2){
                for(int i=0; i<studentNum; i++){
                    System.out.printf("scores["+ i + "]>");
                    scores[i] = Integer.parseInt(scanner.nextLine());
                }
            }
            else if(selectNo == 3){
                for(int i=0; i<studentNum; i++){
                    System.out.println("scores[" + i + "]> " + scores[i]);
                }
            }
            else if(selectNo == 4){
                int highScore = 0;
                int sum = 0;
                double avg = 0.0;
                for(int i=0; i<studentNum; i++){
                    if(highScore < scores[i]){
                        highScore = scores[i];
                    }
                    sum += scores[i];
                }
                avg = (double) sum / studentNum;
                System.out.printf("최고 점수 : " + highScore + "\n");
                System.out.printf("평균 점수 : " + avg + "\n");
            }
            else if(selectNo == 5){
                break;
            }
        }
        System.out.println("프로그램 종료");
        scanner.close();
    }
}
