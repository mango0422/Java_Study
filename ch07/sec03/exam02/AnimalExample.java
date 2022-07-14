package ch07.sec03.exam02;

public class AnimalExample {
    public static void main(String[] args){
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
        System.out.println("-----");

        //변수의 자동 타입 변환
        Animal animal = null;
        animal = new Dog();
        animal.sound();
        animal = new Cat();
        animal.sound();
        System.out.println("-----");

        //메소드의 다형성
        animalSound(new Dog());
        animalSound(new Cat());
    }

    public static void animalSound(Animal animal){
        animal.sound();
    }
}

/*
 1. 가장 일반적인 방식으로 Dog와 Cat 변수로 호출했다.
 2. Animal 변수로 타입 변환해서 sound() 메소드를 호출했다.
    자식은 부모 타입으로 자동 타입 변환이 될 수 있고, 메소드가 재정의되어 있을 경우 재정의된 자식 메소드가 호출되는 다형성의 특징이 그대로 적용된다.
 3. 부모 타입의 매개 변수에 자식 객체를 대입해서 메소드의 다형성을 적용했다.
    이것은 2와 같은 원리로 자식 객체가 부모 타입으로 자동 타입 변환되어 재정의된 sound() 메소드가 호출된다.
    매개 변수의 다형성에 대한 설명은 <타입 변환과 다형성>의 내용 참고바람.
 */