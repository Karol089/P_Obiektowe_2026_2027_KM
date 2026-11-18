package tasks.documents;

import tasks.interfaces.Printable;

public class Report implements Printable {
    @Override
    public void print() {
        System.out.println("This is an example of a report");
    }
}
