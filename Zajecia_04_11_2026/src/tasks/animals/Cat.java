package tasks.animals;

public class Cat extends Animal {

    public void climb(){
        System.out.println("The cat is climbing a tree.");
    }

    @Override
    public void makeSound() {
        System.out.println("Moew!");
    }
}
