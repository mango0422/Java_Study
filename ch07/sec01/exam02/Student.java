package ch07.sec01.exam02;

public class Student extends People{
    public int studentNo;

    public Student(String name, String ssn, int studentNo){
        super(name, ssn);
        this.studentNo = studentNo;
    }
}

/*
 Student 클래스의 생성자는 name, ssn, StudentNo를 매개값으로 받아서 name과 ssn은 다시 부모 생성자를 호출하기 위해 매개값으로 넘겨준다.

 7라인의 super(name, ssn)은 People 생성자인 People(String name, String ssn)을 호출한다.
 7라인을 주석 처리하면 "Implicit super constructor People() is undefined. Must explicitly invoke another constructor"라는 컴파일 에러가 발생한다.
 이것은 부모의 기본 생성자가 없으니 다른 생성자를 명시적으로 호출하라는 의미이다.
 */