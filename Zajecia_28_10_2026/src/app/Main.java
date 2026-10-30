package app;

import tasks.task2_employee.Employee;
import tasks.task2_employee.Manager;

// import tasks.task3.Car; // collision with task 12

import tasks.task4.C;

import tasks.task5.Animal;
import tasks.task5.Dog;
import tasks.task5.Cat;
import tasks.task5.Cow;

import tasks.task2_employee.Manager; // for task 6

import tasks.task7.Device;
import tasks.task7.Computer;
import tasks.task7.Laptop;

import tasks.task8.Book;

import tasks.task9.Game;
import tasks.task9.RPG;
import tasks.task9.AntiCheat;

import tasks.task10.Document;
import tasks.task10.Report;

import tasks.task11.Person;
import tasks.task11.Student;

import tasks.task12.Car;
import tasks.task12.Motorcycle;
import tasks.task12.Truck;
import tasks.task12.Vehicle;

public class Main {
    public static void main(String[] args) {
        // Zadanie 1 && 2
        /*Employee emp1 = new Employee("Leonardo", "daVinci", "painter");
        emp1.showData();*/
        // firstName niedostepne bezpośrednio ze względu na rodzaj private
        // lastName dostepne bezpośrednio ze względu na rodzaj protected
        // "It depends." ~ mgr.inż. Adrian Albrecht

        // Zadanie 3
        /*Car car1 = new Car("Volksvagen", "Golf", 4);
        car1.showInformation();*/

        // Zadanie 4
        // new C();
        // przewidywana kolejność A -> B -> C

        // Zadanie 5
        /*new Animal().makeSound();
        new Dog().makeSound();
        new Cat().makeSound();
        new Cow().makeSound();*/

        // Zadanie 6
        /*Employee emp1 = new Employee("Albert", "Einstein", "Scientist");
        Manager man1 = new Manager("Nicola", "Tesla", "Scientist", "Electrical currents");
        System.out.println(emp1.showInformation());
        System.out.println(man1.showInformation());*/

        // Zadanie 7
        /*Device dev1 = new Device("Lenovo");
        Computer pc1 = new Computer("Lenovo", 8);
        Laptop laptop1 = new Laptop("Lenovo", 8, 10);

        System.out.println(dev1.giveInfo());
        System.out.println(pc1.giveInfo());
        System.out.println(laptop1.giveInfo());
        pc1.addRam(8);
        laptop1.addRam(4);
        System.out.println("\n\n" + pc1.giveInfo() + "\n" + laptop1.giveInfo());*/

        // Zadanie 8
        /*Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        System.out.println(book1);
        System.out.println(book1.getClass());*/

        // Zadanie 9
        /*Game game = new Game();
        RPG rpg = new RPG();
        AntiCheat antiCheat = new AntiCheat();
        game.initialize();
        game.start();
        rpg.start();
        antiCheat.config();*/

        // Zad 10
        /*Document doc1 = new Document("document1");
        Report rep1 = new Report("document");
        Document doc2 = doc1.copy();
        Report rep2 = rep1.copy();*/

        // Zad 11
        /*Person person1 = new Person("Maniek");
        Student student1 = new Student("Stefan", 123456);
        person1.showInformation();
        student1.showInformation();*/

        // Zad 12 - model B
        /*Vehicle vehicle1 = new Vehicle(
                "Volksvagen", "prototype 1", 4, 500);
        Car car1 = new Car(
                "Volksvagen", "Golf", 4, 1500, 4, 30);
        Motorcycle motor1 = new Motorcycle(
                "BWM", "Idk any", 2, 500, 1);
        Truck truck1 = new Truck(
                "Audi", "prototype 1", 4, 500, 12);

        vehicle1.drive();
        car1.drive();
        motor1.drive();
        truck1.drive();*/
    }
}