package ch09.sec02.verify.exam01;

public class AnnoymousExample {
    public static void main(String[] args){
        Annoymous annoy = new Annoymous();
        annoy.field.start();
        annoy.method1();
        annoy.method2(
            new Worker(){
                @Override
                public void start(){
                    System.out.println("테스트를 합니다.");
                }
            }
        );
    }
}
