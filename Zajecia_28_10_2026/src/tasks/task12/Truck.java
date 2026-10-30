package tasks.task12;

public class Truck extends Vehicle{
    private int maxLoad;

    public Truck(String manufacturer, String model, int wheelAmount, int massKg, int maxLoad) {
        super(manufacturer, model, wheelAmount, massKg);
        this.maxLoad = maxLoad;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void reDesign(int massChange, String newModel, int maxLoadChange){
        if(-maxLoadChange >= maxLoad){
            return;
        }
        super.reDesign(massChange, newModel);
        this.maxLoad += maxLoadChange;
    }

    @Override
    public void drive() {
        System.out.println("The truck is dricing.");
    }
}
