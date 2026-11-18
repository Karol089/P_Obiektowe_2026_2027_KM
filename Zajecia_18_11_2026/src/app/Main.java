package app;
// Zadania 1 & 2
import tasks.shapes.Shape;
import tasks.shapes.Triangle;
import tasks.shapes.Circle;
import tasks.shapes.Rectangle;
// Zadanie 3
import tasks.employees.Developer;
import tasks.employees.Employee;
import tasks.employees.Manager;
import tasks.employees.Salesperson;
// Zadanie 4
import tasks.interfaces.Printable;
import tasks.documents.Invoice;
import tasks.documents.Ticket;
import tasks.documents.Report;

public class Main {
    public static void main(String[] args) {
        // Zadanie 1 & 2
        /*Shape[] shapes = {
            new Rectangle("Rectangle1", 5.3, 12.1),
            new Triangle("Triangle1", 3.5, 1.9),
            new Circle("Circle1", 6.7)
        };

        System.out.println();

        for(Shape shape : shapes){
            shape.printInformation();
        }*/

        // Zadanie 3
        /*Employee[] employees = {
                new Developer("Stanislaw Wokulski"),
                new Manager("Jan Skrzetuski"),
                new Salesperson("Rodion Raskolnikow")
        };

        for(Employee employee : employees){
            employee.printPayslip();
        }*/

        // Zadanie 4
        Printable[] documents = {
                new Invoice(),
                new Ticket(),
                new Report()
        };

        for(Printable document : documents){
            document.print();
        }

    }
}