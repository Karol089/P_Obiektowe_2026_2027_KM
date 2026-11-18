package tasks.documents;


import tasks.interfaces.Printable;

public class Invoice implements Printable {
    @Override
    public void print() {
        System.out.println("This is an example of an invoice");
    }
}
