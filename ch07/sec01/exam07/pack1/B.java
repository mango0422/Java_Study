package ch07.sec01.exam07.pack1;

public class B {
    public void method(){
        A a = new A();
        a.field = "value";
        a.method();
    }
}

/*
 A 클래스와 동일한 패키지에 있어서 default 접근 제한과 마찬가지로 B클래스의 생성자와 메소드에서는 A클래스의 protected 필드, 생성자, 메소드에 얼마든지 접근이 가능하다.
 */