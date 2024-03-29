package ch11.sec01.exam14;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
    public static void main(String[] args){
        String str = "안녕하세요";
        byte[] bytes1 = str.getBytes();
        System.out.println("bytes1.length: " + bytes1.length);
        String str1 = new String(bytes1);
        System.out.println("bytes->String: " + str1);

        try{
            byte[] bytes2 = str.getBytes("EUC-KR");
            System.out.println("bytes2.length: " + bytes2.length);
            String str2 = new String(bytes2, "EUC-KR");
            System.out.println("bytes2->String: " + str2);

            byte[] bytes3 = str.getBytes("UTF-8");
            System.out.println("bytes2.length: " + bytes3.length);
            String str3 = new String(bytes3, "UTF-8");
            System.out.println("bytes2->String: " + str3);
        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }
}

/*
 * 현재 사용중인 pc에서는 utf-8이 기본 문자셋임을 확인 가능.
 */