package ch10.sec01.exam04;

public class NumberFormatExceptionExample {
    public static void main(String[] agrs){
        String data1 = "100";
        String data2 = "a100";

        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2);

        int result = value1 + value2;
        System.out.println(data1 + "+" + data2 + "=" + result);
    }
}

/*
 * Exception in thread "main" java.lang.NumberFormatException: For input string: "a100"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:668)
        at java.base/java.lang.Integer.parseInt(Integer.java:784)
        at ch10.sec01.exam04.NumberFormatExceptionExample.main(NumberFormatExceptionExample.java:9)
 */