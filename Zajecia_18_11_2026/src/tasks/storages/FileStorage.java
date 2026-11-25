package tasks.storages;

import tasks.interfaces.Storage;

public class FileStorage implements Storage {
    @Override
    public void save(String data) {
        System.out.println("Zapis do systemu plikow: " + data);
    }
}
