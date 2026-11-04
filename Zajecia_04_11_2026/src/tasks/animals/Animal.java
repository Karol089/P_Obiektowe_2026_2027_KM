package tasks.animals;

public class Animal {

    public void makeSound(){
        System.out.println("Animal is making sound");
    }

    public static void present(Animal animal){
        System.out.println("This is a " + animal.getClass().getSimpleName() + ".");
        animal.makeSound();
    }
}
