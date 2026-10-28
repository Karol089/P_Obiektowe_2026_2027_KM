package tasks.task3;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void showInformation(){
        System.out.printf("Brand: %s \nModel: %s \nNumber of doors: %d\n\n",
                this.getBrand(),
                this.getModel(),
                this.numberOfDoors);
    }
}
