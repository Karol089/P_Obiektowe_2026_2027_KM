package tasks.documents;

import tasks.interfaces.Printable;

public class Ticket implements Printable {
    @Override
    public void print() {
        System.out.println("This is an example of a ticket");
    }
}
