package tasks.computerParts;

public class Computer {
    private String model;

    public Computer(String model) {
        this.model = model;
    }

    public static class Specifications {
        private int ramGb;
        private int diskGb;
        private String proccessor;

        public Specifications(int ramGb, int diskGb, String proccessor) {
            this.ramGb = ramGb;
            this.diskGb = diskGb;
            this.proccessor = proccessor;
        }

        public void print(){
            System.out.printf("RAM: %d \nDisk storage: %d \nProccessor: %s\n", ramGb, diskGb, proccessor);
            //System.out.println(model); // Zwróci błąd - klasa Specification nie jest powiązana z konkretną instancją
            // więc nie może odwoływać się do niestatycznych pól
        }
    }
}
