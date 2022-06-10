package ch06.sec05;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){}

    static Singleton getInstance(){
        return singleton;
    }
}
