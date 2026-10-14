public class Main {
    public static void main(String[] args) {
        // Zadanie 1
        /*Dog dog1 = new Dog("Brutus", "Owczarek nemiecki", 6);
        Dog dog2 = new Dog("Azor", "Bulldog", 10);
        dog1.bark();
        dog2.showInfo();*/

        // Zadanie 2
        /*Point p1 = new Point(5, 2);
        Point p2 = new Point(12, 3);
        System.out.printf("Dystans pomiedzy punktami p1 i p2 wynosi: %.2f", p1.distance(p2));*/

        // Zadanie 3
        /*Book book1 = new Book();
        Book book2 = new Book("Lord of the Rings", "J.R.R. Tolkien");
        Book book3 = new Book("Games of Thrones","Goerge R.R. Martin",  2020);
        System.out.println(book1.author);
        System.out.println(book2.title);
        System.out.println(book3.publicationYear);*/

        // Zadanie 4
        /*Car car1 = new Car("Volkzvagen", "Golf", 2025, 45000);
        car1.showInfo();
        car1.drive(20000);
        car1.drive(-20000);
        car1.showInfo();*/

        // Zadanie 5
        /*Car carOriginal = new Car("Volkzvagen", "Golf", 2025, 45000);
        Car carCopy = new Car(carOriginal);
        carCopy.showInfo();
        System.out.println(carOriginal == carCopy);*/

        // Zadanie 6
        /*Person first = new Person("Anna");
        Person second = first;
        first.introduceYourself();
        second.name = "Jan";
        first.introduceYourself();
        System.out.println(first == second);*/
        // Powstał 1 obiekt
        // Instieją dwie referencje
        // Zmiana widoczna w obu, ponieważ są to referencje do tego samego obiektu

        // Zadanie 7
        /*Person first = new Person("Anna");
        Person second = first;
        Person third = new Person(first);
        System.out.println(first == second);
        System.out.println(first == third);*/

        // Zadanie 8
        /*Counter count1 = new Counter(5);
        Counter count2 = new Counter(0);
        System.out.println(count2.value);
        count1.increaseOther(count2);
        System.out.println(count2.value);*/

        // Zadanie 9
        /*Car car = null;
        car.showInfo(); // program wyrzuci exception*/

        // Zadanie 10
        /*
        a i b  sa referencjami do tego samego obiektu
        c jest nowym obiektem identycznym co do wartości z a;
        Wyniki systemu:
        20
        20
        30
        true
        false
         */

        // Zadanie 11
        /*Product product = new Product("Monitor", 1200);
        product.show();*/

        // Zadanie 12
        // Wybrane : Kino
        // Klasy: Client, Movie, Room, Ticket
        /*Client client1 = new Client("Adam", "Kowalski", 20);
        Room room1 = new Room("A/1", 40);
        Movie movie1 = new Movie(
                "Lord of the Rings",
                "Peter Jackson",
                "Action",
                120,
                13);
        Ticket ticket1 = new Ticket(movie1, room1, "14.10.2026 15:00", 32.99);
        client1.buyTicket(ticket1);
        room1.changeMovie(movie1);
        client1.ticketsBought.getFirst().showInfo();*/

        // Zadanie dodatkowe
        /*Rectangle rect1 = new Rectangle(5.5, 3.4);
        Rectangle rect2 = rect1;
        Rectangle rect3 = new Rectangle(rect1);
        rect1.scale(3);
        System.out.println("\nFirst Rectangle: ");
        rect1.show();
        System.out.println("Second Rectangle: ");
        rect2.show();
        System.out.println("Third Rectangle: ");
        rect3.show();*/

        // example presentation
        /*
        Samochod auto1 = new Samochod(
                "Toyota",
                "Yaris",
                250000);
        Samochod auto2 = new Samochod(
                "Audi",
                "A4",
                2020,
                42000);

        System.out.println(auto1.model + " " + auto1.marka);
        System.out.println(auto1.przebieg);
        auto1.przebieg += 20000;
        System.out.println(auto1.przebieg);
        auto1.zwiekszPrzebieg(10000);
        System.out.println(auto1.przebieg);
        auto1.zwiekszPrzebieg(-100000);
        System.out.println(auto1.przebieg);

        auto1.uruchom();
        System.out.println(auto1.zwrocPrzebieg());

        System.out.println(auto1 == auto2);
        Samochod auto3 = auto2;
        System.out.println(auto2 == auto3);
        Samochod auto4 = new Samochod(
                "Toyota",
                "Yaris",
                250000);
        System.out.println(auto1 == auto4);

        Samochod fail = null;
        fail.uruchom();
        */
    }
}