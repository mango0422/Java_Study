package ch02;
public class PrimitiveAndStringConversionExample {
    public static void main(String[] args){
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value3: " + value3);

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
    }
}

/*
프로그램에서 문자열을 기본 타입으로 변환하는 경우가 매우 많다.
예를 들어, "12"와 "3.5"를 정수 및 실수 타입으로 변환해서 숫자 연산을 하는 경우이다.
String→byte : 
String str = "10";
byte value = Byte.parseByte(str);

String→short : 
String str = "200";
short value = Short,parseByte(str);

String→int :
String str = "300000"
int value = Integer.parseInt(str);

String→long : 
String str = "40000000000";
long value = Long.parseLong(str);

String→float : 
String str = "12.345";
float value = Float.parseFloat(str);

String→double : 
String str = "12.345";
double value = Double.parseDouble(str);

String→boolean : 
String str = "true";
boolean value = Boolean.parseBoolean(str);
*/