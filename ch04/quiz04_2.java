package ch04;

import java.util.Scanner;

public class quiz04_2 {
    public static void main(String[] args){
        System.out.printf("1번 문제 답: \n (for), (while), (do-while)\n\n");

        System.out.printf("2번 문제 답: \n");
        int sum = 0;
        for(int i=1; i<=100; i++){
            if(i%3==0){
                sum +=i;
            }
        }
        System.out.printf("1부터 100까지의 정수중 3의 배수의 합은 %d이다.\n\n", sum);

        System.out.printf("3번 문제 답: \n");
        int num1 = (int)(Math.random()*6) + 1;
        int num2 = (int)(Math.random()*6) + 1;
        while(num1+num2 != 5){
            num1 = (int)(Math.random()*6) + 1;
            num2 = (int)(Math.random()*6) + 1;
        }
        System.out.printf("주사위 눈금은 (%d, %d)이다.\n\n", num1, num2);

        System.out.printf("4번 문제 답: \n");
        for(int x=1; x<=10; x++){
            for(int y=1; y<=10; y++){
                if((x*4 + y * 5) == 60){
                    System.out.printf("(%d, %d)\n", x, y);
                }
            }
        }
        System.out.printf("\n\n");

        System.out.println("5번 문제 답: ");
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        System.out.println();

        System.out.printf("6번 문제 답: \n");
        for(int i=1; i<=4; i++){
            for(int j=4-i; j>0; j--){
                System.out.printf(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");

        System.out.printf("7번 문제 답: \n");
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int balance = 0;

        while(run){
            System.out.println("-------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택> ");
            int sel = scanner.nextInt();
            if(sel==1){
                System.out.print("예금액> ");
                int bal1 = scanner.nextInt();
                balance += bal1;
                System.out.printf("\n\n");
            }
            else if(sel==2){
                System.out.print("출금액> ");
                int bal2 = scanner.nextInt();
                if(bal2>balance){
                    System.out.printf("잔액부족입니다.\n\n");
                    continue;
                }
                balance -= bal2;
                System.out.printf("\n\n");
            }
            else if(sel==3){
                System.out.printf("잔고>%d\n\n", balance);
            }
            else if(sel==4){
                System.out.printf("프로그램 종료");
                break;
            }
            else{
                System.out.printf("잘못 입력하셨습니다.\n\n");
            }
        }
        System.out.printf("\n\n");
    }
}
