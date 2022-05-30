package ch05;

public class MainStringArrayArgument {
    public static void main(String[] args){
        args = new String[] { "10", "20" }; // 주석처리시 if 조건문에 해당됨.
        if(args.length !=2){
            System.out.println("값의 수가 부족합니다.");
            System.exit(0); // 프로그램 강제종료
        }

        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}