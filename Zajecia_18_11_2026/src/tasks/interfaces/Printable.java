package tasks.interfaces;

public interface Printable {
    void print();

    default void printHeader(){
        System.out.println("___FORMAL DOCUMENT___");
    }
}
