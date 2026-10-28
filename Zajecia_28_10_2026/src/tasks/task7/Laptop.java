package tasks.task7;

public class Laptop extends Computer{
    private final int batteryCapacityWh;

    public Laptop(String manufacturer, int ramGb, int batteryCapacityWh){
        super(manufacturer, ramGb);
        this.batteryCapacityWh = batteryCapacityWh;
    }

    public int getBatteryCapacityWh() {
        return batteryCapacityWh;
    }

    @Override
    public String giveInfo(){
        return super.giveInfo() + "Maximum battery capacity (Wh): %d\n".formatted(this.batteryCapacityWh);
    }
}
