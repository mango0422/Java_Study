package ch10.sec01.exam01;

public class NullPointerExceptionExample {
    public static void main(String[] args){
        String data = null;
        System.out.println(data.toString());
    }
}

/*
 * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toString()" because "data" is null
        at ch10.sec01.exam01.NullPointerExceptionExample.main(NullPointerExceptionExample.java:6)
 */