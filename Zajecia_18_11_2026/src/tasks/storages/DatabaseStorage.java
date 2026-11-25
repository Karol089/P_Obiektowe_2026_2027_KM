package tasks.storages;

import tasks.interfaces.Storage;

public class DatabaseStorage implements Storage {
    @Override
    public void save(String data) {
        System.out.println("Zapis do bazy danych: " + data);
    }
}
