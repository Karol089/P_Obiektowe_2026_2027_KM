package tasks.animals;

public class Dog extends Animal {

    public void digHole(){
        System.out.println("The dog is digging a hole.");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
