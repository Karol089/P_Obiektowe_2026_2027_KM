package tasks.animals;

public class Animal {

    public void makeSound(){
        System.out.println("Animal is making sound");
    }

    public static void makeSound(Animal animal){
        animal.makeSound();
    }

    public static void present(Animal animal){
        System.out.println("This is a " + animal.getClass().getSimpleName() + ".");
        animal.makeSound();
    }

    public static void specialAction(Animal animal){
        if(animal instanceof Dog dog){
            dog.digHole();
        } else if (animal instanceof Cat cat){
            cat.climb();
        }
    }

    public static void indentify (Animal animal){
        System.out.println("Animal");
    }
}
