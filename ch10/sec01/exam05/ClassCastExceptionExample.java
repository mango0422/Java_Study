package ch10.sec01.exam05;

public class ClassCastExceptionExample{
    public static void main(String[] args){
        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat);
    }

    public static void changeDog(Animal animal){
        // if(animal instanceof Dog){
            Dog dog = (Dog) animal;
        // }
    }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

/*
 * Exception in thread "main" java.lang.ClassCastException: class ch10.sec01.exam05.Cat cannot be cast to class ch10.sec01.exam05.Dog (ch10.sec01.exam05.Cat and ch10.sec01.exam05.Dog are in unnamed module of loader 'app')
        at ch10.sec01.exam05.ClassCastExceptionExample.changeDog(ClassCastExceptionExample.java:14)
        at ch10.sec01.exam05.ClassCastExceptionExample.main(ClassCastExceptionExample.java:9)
 */