package ch10.sec01.exam02;

public class ArrayIndexOutOfBoundExceptionExample {
    public static void main(String[] args){
        String data1 = args[0];
        String data2 = args[1];

        System.out.println("args[0]: " + data1);
        System.out.println("args[1]: " + data2);
    }
}

/*
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        at ch10.sec01.exam02.ArrayIndexOutOfBoundExceptionExample.main(ArrayIndexOutOfBoundExceptionExample.java:5)
 */