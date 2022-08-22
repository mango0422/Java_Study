package ch11.sec01.verify.exam08;

public class IntegerCompareExample {
    public static void main(String[] args){
        Integer obj1 = 100;
        Integer obj2 = 100;
        Integer obj3 = 300;
        Integer obj4 = 300;

        System.out.println( obj1 == obj2 );
        System.out.println( obj3 == obj4 );
    }
}

/*
 * 100을 박싱한 Integer 객체는 true가 나오는데 300을 박싱한 Integer 객체는 false가 나온다.
 * 그 이유는 무엇인가?
 * 
 * -128 ~ 127은 값을 비교하지만, 그 외의 값은 번지를 비교하기 때문이다.
 */