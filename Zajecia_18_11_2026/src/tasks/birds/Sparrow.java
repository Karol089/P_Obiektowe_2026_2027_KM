package tasks.birds;

import tasks.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void eat() {
        System.out.println("A sparrow is eating.");
    }

    @Override
    public void fly() {
        System.out.println("The sparrow is flying quietly.");
    }
}
