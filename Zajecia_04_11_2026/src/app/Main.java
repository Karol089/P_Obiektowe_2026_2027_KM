package app;

// Zadania 1 - 3, 5 - 8, 10 - 11
import tasks.animals.*;

// Zadanie 4
import tasks.employees.Developer;
import tasks.employees.Employee;
import tasks.employees.Manager;
import tasks.employees.Tester;

// Zadanie 9
import tasks.task9.Parent;
import tasks.task9.Child;

// Zadanie 12
import tasks.payments.Payment;
import tasks.payments.BlikPayment;
import tasks.payments.CardPayment;
import tasks.payments.TransferPayment;

// Zadanie 13
import tasks.shapes.Shape;
import tasks.shapes.Circle;
import tasks.shapes.Rectangle;
import tasks.shapes.Triangle;

public class Main {
    public static void main(String[] args) {

        // Zadania 1 - 3, 5 - 8, 10 - 11 (pakiet animals)

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
        /*Dog dog = new Dog();
        Animal animal = dog;

        System.out.println("\n\nZadanie 5");
        animal.makeSound();
        dog.makeSound();
        dog.digHole();*/

        // Zadanie 6
        /*Animal first = new Dog();
        Animal second = new Cat();

        System.out.println("\n\nZadanie 6");
        Dog dog = (Dog) first;
        Cat cat = (Cat) second;
        dog.digHole();
        cat.climb();*/

        // Dog dog_err  = (Dog) second;
        // ClassCastException


        // Zadanie 7
        /*System.out.println("\n\nZadanie 7");
        Animal[] animals_7 = {
                new Dog(),
                new Cat()
        };
        for(Animal animal : animals_7){
            Animal.specialAction(animal);
        }*/


        // Zadanie 8
        /*System.out.println("\n\nZadanie 8");
        Animal[] animals_8 = {
                new Dog(),
                new Cat()
        };
        for(Animal animal : animals_8){
            Animal.makeSound(animal);
        }*/


        // Zadanie 10
        /*System.out.println("\n\nZadanie 10");
        Animal animal = new Dog();

        Animal.indentify(animal); // wersja z klasy animal
        animal.makeSound(); // wersja z klasy Dog*/
        // Przeciążanie zachodzi na etapie kompilacji i korzysta z typu referencyjnego, podczas
        // gdy nadpisywanie zachodzi w trakcie wykonania i bierze pod uwagę typ rzeczywisty


        // Zadanie 11
        /*System.out.println("\n\nZadanie 11");
        Animal animal = new GuideDog();
        System.out.println(animal instanceof Animal); // true
        System.out.println(animal instanceof Dog); // true
        System.out.println(animal instanceof GuideDog); // true
        System.out.println(animal.getClass() == Animal.class); // false
        System.out.println(animal.getClass() == Dog.class); // false
        System.out.println(animal.getClass() == GuideDog.class); // true*/




        // Zadanie 4 (pakiet employees)

        /*Employee[] employees = {
                new Employee(),
                new Developer(),
                new Manager(),
                new Tester()
        };

        System.out.println("\n\nZadanie 4");
        for(Employee employee: employees){
            System.out.println(employee.calculateSalary());
        }*/



        // Zadanie 9 (pakiet task9)
        /*System.out.println("\n\nZadanie 9");
        Parent object = new Child();
        System.out.println(object.value); // Parent
        System.out.println(object.getValue()); // Child*/
        // Wartość domyślna jest ustawiana na etapie kompilacji, a wybór nadpisanej funkcji
        // na etapie wykonania



        // Zadanie 12 (pakiet payments)
        /*System.out.println("\n\nZadanie 12");

        Payment[] payments = {
                new BlikPayment("BLIK"),
                new CardPayment("Card"),
                new TransferPayment("Transfer"),
                new Payment("Payment")
        };

        for(Payment payment : payments){
            payment.pay(99.99);
        }*/

        // Zadanie 13 (pakiet shapes)
        /*System.out.println("\n\nZadanie 13");

        Shape[] shapes = {
                new Shape("Shape"),
                new Rectangle("Rectangle", 5.5, 6.1),
                new Triangle("Triangle", 3.1, 4.5),
                new Circle("Circle", 7.2)
        };

        for (Shape shape : shapes){
            Shape.printShape(shape);
        }*/
    }
}