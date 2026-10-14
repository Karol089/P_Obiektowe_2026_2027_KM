public class Car {
    String brand;
    String model;
    int productionYear;
    double mileage;


    public Car(Car other){
        this(other.brand, other.model, other.productionYear, other.productionYear);
    }

    public Car(){
        this("Unknown", "Unknown", 2026, 0.0);
    }

    public Car(String brand, String model, double mileage){
        this(brand, model, 2026, mileage);
    }

    public Car(String brand, String model, int productionYear, double mileage) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
    }

    public void drive(double distance){
        if(distance > 0) this.mileage += distance;
    }

    public void showInfo(){
        System.out.printf("Brand: %s \nModel: %s \nProduction year: %d \nMileage: %.2f\n\n",
                this.brand, this.model, this.productionYear, this.mileage);
    }
}
