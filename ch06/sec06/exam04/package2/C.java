package ch06.sec06.exam04.package2;

import ch06.sec06.exam04.package1.A;

public class C {
    // 필드
    A a1 = new A(true);     //(o)
    // A a2 = new A(1);        //(x) <-------- default 생성자 접근 불가 (컴파일 에러)
    // A a3 = new A("문자열"); //(x) <-------- private 생성자 접근 불가 (컴파일 에러)
}

/*
 패키지가 다른 C 클래스에서는 A 클래스의 public 생성자를 제외한 다른 생성자를 호출할 수 없다.
 */