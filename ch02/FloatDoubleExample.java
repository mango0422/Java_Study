package ch02;
public class FloatDoubleExample {
    public static void main(String[] args){
        //실수값 저장
        //float var1 = 3.14;
        float var2 = 3.14f;
        double var3 = 3.14;

        //정밀도 테스트
        float var4 = 0.1234567890123456789f;
        double var5 = 0.1234567890123456789;

        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);

        //e 사용하기
        double var6 = 3e6;
        float var7 = 3e6f;
        double var8 = 2e-3;
        System.out.println("var6: " + var6);
        System.out.println("var7: " + var7);
        System.out.println("var8: " + var8);
    }
}

/*
자바는 실수 리터럴을 기본적으로 double 타입으로 해석하기 때문에 double 타입 변수에 저장해야 한다.
실수 리터럴을 float 타입 변수에 저장하면 컴파일 에러가 발생한다.
실수 리터럴을 float 타입으로 저장하고 싶다면 리터럴 뒤에 소문자 f나 대문자 F를 붙여 컴파일러가 float 타입임을 알 수 있도록 해야 한다.
float 타입과 double 타입이 허용하는 소수점 이하 자리는 각각 7자리, 15자리입니다.
double 타입은 float 타입보다 2배 정도 정밀도 높기 때문에 좀 더 정확히 데이터 저장이 가능하다.
*/