package ch06.sec06.exam05;

public class A {
    //필드
    public int field1;
    int field2;
    private int field3;

    //생성자
    public A(){
        field1 = 1; //(o)
        field2 = 1; //(o)
        field3 = 1; //(o)

        method1();  //(o)
        method2();  //(o)
        method3();  //(o)
    }

    //메소드
    public void method1(){}  // <----- public 접근 제한
    void method2(){}         // <----- default 접근 제한
    private void method3(){} // <----- private 접근 제한
}

/*
 A 클래스 내부에서는 접근 제한과는 상관없이 필드와 메소드를 모두 사용할 수 있다.
 */