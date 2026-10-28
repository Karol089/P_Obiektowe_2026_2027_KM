package tasks.task7;

public class Device {
    private final String manufacturer;

    public Device(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String giveInfo(){
        return "Device manyfactured by: %s\n".formatted(this.manufacturer);
    }
}
