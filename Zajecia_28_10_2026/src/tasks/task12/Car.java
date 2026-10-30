package tasks.task12;

public class Car extends Vehicle{
    private int doorAmount;
    private int trunkCapacityM2;

    public Car(String manufacturer, String model, int wheelAmount, int massKg, int doorAmount, int trunkCapacityM2) {
        super(manufacturer, model, wheelAmount, massKg);
        this.doorAmount = doorAmount;
        this.trunkCapacityM2 = trunkCapacityM2;
    }

    public int getDoorAmount() {
        return doorAmount;
    }

    public int getTrunkCapacityM2() {
        return trunkCapacityM2;
    }

    public void reDesign(int massChange, String newModel, int newDoors, int newCapacity){
        if(newDoors <= 0 || newCapacity <= 0){
            return;
        }
        super.reDesign(massChange, newModel);
        this.doorAmount = newDoors;
        this.trunkCapacityM2 = newCapacity;
    }

    @Override
    public void drive() {
        System.out.println("The Car is driving.");
    }
}
