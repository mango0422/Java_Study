package ch09.sec02.verify.exam02;

public class AnnoymousExample {
    public static void main(String[] args){
        Annoymous annoy = new Annoymous();

        annoy.field.run();
        annoy.method1();
        annoy.method2(
            new Vehicle() {
                @Override
                public void run(){
                    System.out.println("트럭이 달립니다.");
                }
            }
        );
    }
}
