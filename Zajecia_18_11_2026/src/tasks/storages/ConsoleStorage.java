package tasks.storages;

import tasks.interfaces.Storage;

public class ConsoleStorage implements Storage {
    @Override
    public void save(String data) {
        System.out.println("Zapis do konsoli: " + data);
    }
}
