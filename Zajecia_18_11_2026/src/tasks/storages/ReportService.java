package tasks.storages;

import tasks.interfaces.Storage;

public class ReportService  {
    private Storage storage;

    public ReportService(Storage storage) {
        this.storage = storage;
    }

    public void generateReport(){
        String report = "Raport";

        this.storage.save(report);
    }
}
