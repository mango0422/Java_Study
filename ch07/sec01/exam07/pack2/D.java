package ch07.sec01.exam07.pack2;
import ch07.sec01.exam07.pack1.A;

public class D extends A{
    public D(){
        super();
        this.field = "value";
        this.method();
    }
}

/*
 다음 D 클래스는 A 클래스와 다른 패키지에 있다.
 하지만 C 클래스와는 달리 D는 A의 자식 클래스이다.
 그렇기 때문에 A 클래스의 protected 필드, 생성자, 메소드에 접근이 가능하다.
 단 new 연산자를 사용해서 생성자를 직접 호출할 수는 없고, 자식 생성자에서 super()로 A 생성자를 호출할 수 있다.
 */