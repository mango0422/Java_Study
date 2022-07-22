package ch09.sec01.exam03;

public class A {
    int field1;
    void method1() { }

    static int field2;
    static void method2() { }

    class B {
        void method2() {
            field1 = 10;
            method1();

            field2 = 10;
            method2();
        }
    }

    static class c {
        void method(){
            //field1 = 10;
            //method1();

            field2 = 10;    // 인스턴스 필드와 메소드는
            method2();      // 접근할 수 없음
        }
    }
}