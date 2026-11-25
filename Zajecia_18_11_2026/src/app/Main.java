package app;
// Zadania 1 & 2
import tasks.interfaces.*;
import tasks.shapes.Circle;
import tasks.shapes.Rectangle;
import tasks.shapes.Shape;
import tasks.shapes.Triangle;
// Zadanie 3
import tasks.employees.Developer;
import tasks.employees.Employee;
import tasks.employees.Manager;
import tasks.employees.Salesperson;
// Zadanie 4 - 6
import tasks.documents.Invoice;
import tasks.documents.Report;
import tasks.documents.Ticket;
// Zadanie 7
import tasks.letters.C;
// Zadanie 8
import tasks.filetypes.TextDocument;
// Zadanie 12
import tasks.payments.BlikPayment;
import tasks.payments.CardPayment;
import tasks.payments.OrderService;
import tasks.payments.TransferPayment;
// Zadanie 13 && 14
import tasks.interfaces.Storage;
import tasks.storages.ReportService;
import tasks.storages.DatabaseStorage;
import tasks.storages.FileStorage;
import tasks.storages.ConsoleStorage;



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
        /*Printable[] documents = {
                new Invoice(),
                new Ticket(),
                new Report()
        };

        for(Printable document : documents){
            document.print();
        }*/

        // Zadanie 5
        /*Report report = new Report();
        Printable printable = report;
        Exportable exportable = report;
        Savable savable = report;
        printable.print();
        exportable.export("pdf");
        savable.save();*/

        // Zadanie 6
        /*Report report = new Report();
        Invoice invoice = new Invoice();
        report.printHeader();
        invoice.printHeader();*/

        // Zadanie 7
        /*C letter_c = new C();
        letter_c.hello();*/

        // Zadanie 8
        /*TextDocument textDocument = new TextDocument();
        textDocument.read();
        textDocument.write();*/

        // Zadanie 9
        // Nowy projekt jest lepszy, ponieważ lepiej odwzorowuje relacje zachodzące rzeczywistości

        // Zadanie 10
        // Car - Engine -- Kompozycja HAS-A
        // Dog - Animal -- Dziedziczenie IS-A
        // House - Address -- Kompozycja IS-A
        // Manager - Employee -- Dziedziczenie IS-A
        // Computer - Proccessor -- Kompozycja HAS-A
        // Student - Uniwersity -- Asocjacja USES-A
        // Book - Author -- Agregacja HAS-A
        // Order - PaymentMethod -- Asocjacja USES-A

        // Zadanie 11
        // Dziedziczenie byłoby błędem ponieważ nie występuje relacja IS-A

        // Zadanie 12
        /*PaymentMethod[] paymentMethods = {
                new BlikPayment(),
                new CardPayment(),
                new TransferPayment()
        };
        OrderService[] orderServices = {
                new OrderService(paymentMethods[0]),
                new OrderService(paymentMethods[1]),
                new OrderService(paymentMethods[2])
        };

        for(OrderService order : orderServices){
            order.checkOut(12.5);
        }*/

        // Zadanie 13 && 14
        /*Storage[] storages = {
                new DatabaseStorage(),
                new ConsoleStorage(),
                new FileStorage()
        };

        ReportService[] repServices = new ReportService[3];
        for(int i = 0; i < 3; i++){
            repServices[i] = new ReportService(storages[i]);
        }
        for (ReportService rep : repServices){
            rep.generateReport();
        }*/

        // Zadanie 15
        /*
         Shape - Klasa abstrakcyjna
         -- Potrzebny wspólny stan (np.nazwa)
         -- Istnieje IS-A (Circle IS-A shape)
         -- wszystkie korzystające podklasy są ściśle związane

         Printable - interfejs
         -- kontrakt może dotyczyć wielu niezwiązanych klas

         Employee - Klasa abstrakcyjna
         -- Potrzebny wspólny stan (np.nazwisko)
         -- Istnieje IS-A (Manager IS-A employee)
         -- wszystkie korzystające podklasy są ściśle związane

         Comparable - interfejs
         -- kontrakt może dotyczyć wielu niezwiązanych klas

         Vehicle - Klasa abstrakcyjna
         -- Potrzebny wspólny stan (np.nazwa)
         -- Istnieje IS-A (Car IS-A vehicle)
         -- wszystkie korzystające podklasy są ściśle związane

         Encryptable - interfejs
        -- kontrakt może dotyczyć wielu niezwiązanych klas

        NotificationSender - interfejs
        -- kontrakt może dotyczyć wielu niezwiązanych klas

        Account - Klasa abstrakcyjna
        -- Potrzebny wspólny stan (np. balans)
        -- Istnieje IS-A (DebitAccount IS-A Account)
        -- wszystkie korzystające podklasy są ściśle związane
        */
    }
}