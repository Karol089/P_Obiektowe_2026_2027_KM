package tasks.interfaces;

public interface A {
    default void hello(){
        System.out.println("'Hello There' ~ Obi-wan Kenobi");
    }
}
