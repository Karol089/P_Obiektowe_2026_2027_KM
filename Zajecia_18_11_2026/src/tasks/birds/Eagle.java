package tasks.birds;

import tasks.interfaces.Flyable;

public class Eagle extends Bird implements Flyable {
    @Override
    public void eat() {
        System.out.println("The eagle is eating.");
    }

    @Override
    public void fly() {
        System.out.println("The eagle soars smoothly.");
    }
}
