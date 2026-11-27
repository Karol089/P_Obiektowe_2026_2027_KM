package zad9;

public class Dog extends Animal {

    static void show(Dog dog) {
        System.out.println("show Dog");
    }

    @Override
    public void sound() {
        System.out.println("Dog");
    }
}
