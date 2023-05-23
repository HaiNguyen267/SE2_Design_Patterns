package singleton;

public class Main {
    public static void main(String[] args) {
        // regular class: Dog
        Dog dog = new Dog(); // instance 1
        Dog dog2 = new Dog(); // instance 2
        Dog dog3 = new Dog(); // instance 3
        dog.bark();
        dog2.bark();
        dog3.bark();

        // singleton class: Logger
        Logger logger = Logger.getInstance(); // instance 1
        Logger logger2 = Logger.getInstance(); // still instance 1
        System.out.println(logger == logger2); // true
    }
}
