package app;

// Zadania 1 - 3
import tasks.animals.Animal;
import tasks.animals.Cat;
import tasks.animals.Dog;
import tasks.animals.Cow;
import tasks.animals.Sheep;

// Zadania 4 - ?
import tasks.employees.Developer;
import tasks.employees.Employee;
import tasks.employees.Manager;
import tasks.employees.Tester;

public class Main {
    public static void main(String[] args) {

        // Zadania 1 - 3, 5 (pakiet animals)

        /*// Zadanie 1
        // 3. - wykonana zostanie wersja nadpisana w podklasach
        // 4. - nie
        System.out.println("Zadanie 1");

        Animal first = new Dog(); // typ referencji - Animal, typ rzeczywisty - Dog
        Animal second = new Cat();
        first.makeSound();
        second.makeSound();

        // Zadanie 2
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Cow(),
                new Sheep()
        };

        System.out.println("\n\nZadanie 2");
        for( Animal animal : animals){
            animal.makeSound();
        }

        // Zadanie 3
        System.out.println("\n\nZadanie 3");
        for( Animal animal : animals){
            Animal.present(animal);
        }*/

        // Zadanie 5
        Dog dog = new Dog();
        Animal animal = dog;

        System.out.println("\n\nZadanie 5");
        animal.makeSound();
        dog.makeSound();
        dog.digHole();


        // Zadania 4 - ? (pakiet employees)


        // Zadanie 4

        Employee[] employees = {
                new Employee(),
                new Developer(),
                new Manager(),
                new Tester()
        };

        System.out.println("\n\nZadanie 4");
        for(Employee employee: employees){
            System.out.println(employee.calculateSalary());
        }

        // Zadanie 5

    }
}