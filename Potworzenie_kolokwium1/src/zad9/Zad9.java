package zad9;

import static zad9.Animal.show;
import static zad9.Dog.show;

public class Zad9 {
    public static void main(String[] args){
        Animal animal = new Dog();

        show(animal); // rostrzyga kompilator
        // przciążenie roztrzygane jest na bazie typu referencyjnego
        animal.sound(); // podlega dynamicznemu wiązaniu
        // nadpisywanie roztrzygane jest na podstawie typu rzeczywistego
    }
}
