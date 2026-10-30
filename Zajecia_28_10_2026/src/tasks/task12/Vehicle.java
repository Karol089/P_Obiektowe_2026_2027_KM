package tasks.task12;

public class Vehicle {
    private final String manufacturer;
    private String model;
    private final int wheelAmount;
    private int massKg;

    public Vehicle(String manufacturer, String model, int wheelAmount, int massKg) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.wheelAmount = wheelAmount;
        this.massKg = massKg;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getWheelAmount() {
        return wheelAmount;
    }

    public int getMassKg() {
        return massKg;
    }

    public void reDesign(int massChange, String newModel){
        if(-massChange >= this.massKg){
            return;
        }
        this.massKg += massChange;
        this.model = newModel;
    }

    public void drive(){
        System.out.println("The vehicle is driving.");
    }
}
