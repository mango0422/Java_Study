public class LongExample {
    public static void main(String[] args){
        long var1 = 10;
        long var2 = 20L;
        // long var3 = 1000000000000;
        long var4 = 1000000000000L; // int 타입의 허용 범위를 초과할 경우, long 타입임을 컴파일러에게 알려주어야 한다. 정수 리터럴뒤에 소문자 l이나 대문자 L을 붙이는 식으로..
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}