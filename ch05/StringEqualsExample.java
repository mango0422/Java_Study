package ch05;

public class StringEqualsExample {
    public static void main(String[] args){
        String strVar1 = "신현호";
        String strVar2 = "신현호";

        if(strVar1 == strVar2){
            System.out.println("strVar1과 strVar2는 참조가 같음");
        }else{
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if(strVar1.equals(strVar2)){
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }
        
        String strVar3 = new String("신현호");  // 객체 생성 연산자
        String strVar4 = new String("신현호");  // 객체 생성 연산자

        if(strVar3 == strVar4){
            System.out.println("strVar3과 strVar4는 참조가 같음");
        }else{
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }

        if(strVar3.equals(strVar4)){
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }
    }
}

/*
문자열이 직접 변수에 저장되는 것이 아니라, 문자열은 String 객체로 생성되고 변수는 String 객체를 참조한다.
== 연산자는 변수에 저장된 객체의 번지가 동일한지를 검사한다.
동일한 문자열 리터럴로 String 객체를 생성했을 경우 == 연산의 결과는 true가 나오지만,
new 연산자로 String 객체를 생성했을 경우 == 연산의 결과는 false가 나온다.

동일한 String 객체이건 다른 String 객체이건 상관없이 내부 문자열을 비교하고 싶을 때에는 String 객체의 equal() 메소드를 사용해야 한다.

참조를 잃은 String 객체는 JVM이 쓰레기 객체로 취급하고 쓰레기 수집기를 구동시켜 메모리에서 자동 제거한다.
*/