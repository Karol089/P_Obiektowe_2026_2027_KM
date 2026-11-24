package tasks.documents;

import tasks.interfaces.Printable;
import tasks.interfaces.Exportable;
import tasks.interfaces.Savable;
public class Report implements Printable, Exportable, Savable {
    @Override
    public void print() {
        System.out.println("This is an example of a report");
    }

    @Override
    public void export(String format) {
        System.out.println("This report has been exported to " + format + ".");
    }

    @Override
    public void save() {
        System.out.println("This report has been saved in default format.");
    }
}
