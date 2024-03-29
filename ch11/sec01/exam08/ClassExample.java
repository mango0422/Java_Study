package ch11.sec01.exam08;

public class ClassExample {
    public static void main(String[] args) throws Exception{
        //첫 번째 방법
        Class clazz = Car.class;

        //두 번재 방법
        // Class clazz = Class.forName("ch11.sec01.exam08.Car");

        //세 번째 방법
        // Car car = new Car();
        // Class clazz = car.getClass();

        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackage().getName());
    }
}
