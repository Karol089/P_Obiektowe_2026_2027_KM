package app;

// Zadanie 1
import tasks.computerParts.Computer;
// Zadanie 2
import tasks.accounts.BankAccount;
// Zadanie 3
import tasks.company.Company;
// Zadanie 4 & 5 & 7 & 10
import tasks.validation.PasswordValidator;
import tasks.validation.NameValidation;
import tasks.validation.Validator;
import tasks.validation.SimpleTextValidator;
// Zadanie 8
import tasks.buttonComponents.Button;
// Zadanie 9
import tasks.Task;

public class Main {
    public static void main(String[] args) {

        // Zadanie 1
        /*Computer.Specifications specifications = new Computer.Specifications(16, 512, "Intel");
        specifications.print();*/

        // Zadanie 2
        /*BankAccount acc1 = new BankAccount("Mickiewicz");
        BankAccount.Transaction transaction1 = acc1.new Transaction("Simple payment example", 44.00);
        BankAccount acc2 = new BankAccount("Kmicic");
        BankAccount.Transaction transaction2 = acc2.new Transaction("Another simple payment example", 300.00);
        transaction1.print();
        transaction2.print();*/

        // Zadanie 3
        /*Company company = new Company("Mickiewicz spolka z.o.o.");
        Company.Departament departament = company.new Departament("Sonety");
        departament.printNames();*/

        // Zadanie 4
        /*PasswordValidator.validate("Onomatopeja");
        PasswordValidator.validate("");
        PasswordValidator.validate("     ");*/

        // Zadanie 5
        /*String[] names = {"Adam", "Jan", "", "   ", "Anna"};
        NameValidation.validate(names);*/

        // Zadanie 6
        /*int minimumLength = 5;

        // minimumLength = 10;
        // java: local variables referenced from an inner class must be final or effectively final
        // effectivly final oznacza, że raz zadeklarowana zmienna nie ma ponownie przypisanej wartości

        class Validator {

            public boolean isValid(
                    String value
            ) {
                return value != null
                        && value.length()
                        >= minimumLength;
            }
        }*/

        // Zadanie 7
        /*Validator validator = new Validator() {
            @Override
            public boolean isValid(String value) {
                return !(value == null) && value.contains("@") &&
                        value.substring(value.indexOf("@"), value.length() - 1).contains(".");
            }
        };
        String[] emails = {
                "janBawarski@wp.pl",
                "janNowogrodzki.wp.pl@",
                "annaCzestochowska"
        };
        for (String email : emails){
            System.out.println(validator.isValid(email));
        }*/

        // Zadanie 8
        /*Button button1 = new Button("button1");
        button1.setClickListener();
        button1.click();*/

        // Zadanie 9
        /*Task counter = new Task() {
            private int count = 0;
            @Override
            public void execute() {
                System.out.println(++this.count);
            }
        };

        for(int i = 0; i < 5; i++){
            counter.execute();
        }*/

        // Zadanie 10
        // Klasa anonimowa zastąpiona odrębną, nazwaną klasą w celu ułatwienia dostępu
        // i ograniczenia duplikacji kodu



    }
}