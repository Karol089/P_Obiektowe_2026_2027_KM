package tasks.task12;

public class Motorcycle extends Vehicle{
    private int windshieldSizeM2;

    public Motorcycle(String manufacturer, String model, int wheelAmount, int massKg, int windshieldSizeM2) {
        super(manufacturer, model, wheelAmount, massKg);
        this.windshieldSizeM2 = windshieldSizeM2;
    }

    public int getWindshieldSizeM2() {
        return windshieldSizeM2;
    }

    public void reDesign(int massChange, String newModel, int shieldSizeChange){
        if( -shieldSizeChange > this.windshieldSizeM2){
            return;
        }
        super.reDesign(massChange, newModel);
        this.windshieldSizeM2 += shieldSizeChange;
    }

    @Override
    public void drive() {
        System.out.println("The motorcycle is driving.");
    }
}
