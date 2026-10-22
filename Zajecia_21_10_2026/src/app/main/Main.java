package app.main;

import animals.Cat;
import animals.Dog;

import app.BankAccount;
import app.ExamResults;
import app.InitializationDemo;
import app.Product;
import app.Person;
import app.User;
import app.StaticCalculator;

import zad12.Course;
import zad12.Student;

public class Main {
    public static void main(String[] args) {

        // Zadanie 1
        /*Cat.makeSound();
        Dog.makeSound();*/

        // Zadanie 2
        /*Person person1 = new Person("Jan", 20, "jan.kowalski@wp.pl");
        person1.showInfo();
        System.out.println(person1.getName());
        System.out.println(person1.getAge() + "\n");
        person1.setName(null);
        person1.setName("");
        person1.setEmail("test");
        person1.showInfo();
        person1.setName("Pawel");
        person1.setEmail("pawel.kowalski@wp.pl");
        person1.birthday();
        person1.showInfo();*/

        // Zadanie 3
        /*BankAccount account1 = new BankAccount("Barbara Nowak");
        account1.showInfo();
        account1.deposit(-12.5);
        account1.deposit(500.53);
        account1.withdraw(600.00);
        account1.withdraw(200.53);
        account1.showInfo();*/

        // Zadanie 4
        /*int[] exam1 = {1, 2, 3, 4, 5, 6};
        ExamResults results1 = new ExamResults(exam1);
        System.out.println(results1.getPoints());
        System.out.println(exam1);*/

        // Zadanie 5
        /*Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        Product product4 = new Product();
        System.out.println(Product.getNumberOfProducts());*/

        // Zadanie 6
        // MAX_PRODUCTS powinno być static, ponieważ jest wspólne dla całej klasy
        // MAX_PRODUCTS powinno być final, ponieważ system nie powiniem miec mozliwości zmiany pola
        // numberOfProducts nie powinno byc final, ponieważ jest ono modyfikowane

        // Zad 7
        /*System.out.println(StaticCalculator.add(5, 2));
        System.out.println(StaticCalculator.substract(5, 2));
        System.out.println(StaticCalculator.multiply(5, 2));
        System.out.println(StaticCalculator.getNumberOfOperations());*/

        // Zad 8
        /*System.out.println(StaticCalculator.add(2, 3, 4));
        System.out.println(StaticCalculator.add(2.2, 3.3));*/

        // Zad 9
        //new InitializationDemo();

        // Zad 11
        /*User user1 = new User("exampleLogin1", "examplePassword1", 20);
        User user2 = new User("exampleLogin2", "exampleExtendedPassword", 22);
        user1.showUser();
        user2.showUser();
        user1.birthday();
        user1.setPassword("wrongPassword", "examplePassword2");
        user1.setPassword("examplePassword1", "examplePassword3");
        user1.showUser();*/

        // Zad 12
        /*Student student1 = new Student("Stanislaw", "Wokulski", "123456", 40);
        Student student2 = new Student("Andrzej", "Kmicic", "234567", 32);
        Student student3 = new Student("Rodion", "Raskolnikow", "345678", 26);
        Student student4 = new Student("Jan", "Skrzetuski", "456789", 36);

        Course course1 = new Course("Swimming lessons", 20);
        Course course2 = new Course("Programming course", 30);
        Course course3 = new Course("Course naming course", 1);

        course1.register(student1);
        course2.register(student2);
        course3.register(student1);
        course3.register(student3);
        course1.register(student2);
        course1.register(student1);
        course1.cancelRegistration(student2);

        course1.showInfo();
        course2.showInfo();
        course3.showInfo();

        student1.showInfo();*/


    }
}