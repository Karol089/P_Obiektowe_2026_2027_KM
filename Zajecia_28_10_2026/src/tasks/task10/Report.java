package tasks.task10;

public class Report extends Document{
    public Report(String fileName) {
        super(fileName);
    }

    @Override
    public Report copy() {
        return new Report(this.getFileName());
    }
}
