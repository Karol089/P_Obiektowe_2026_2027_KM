package tasks.computerParts;

public class Computer {
    private String model;

    public static class Specifications {
        private int ramGb;
        private int diskGb;
        private String proccessor;

        public void print(){
            System.out.printf("RAM: %d \nDisk storage: %d \nProccessor: %s\n", ramGb, diskGb, proccessor);
        }
    }
}
