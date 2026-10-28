package tasks.task7;

public class Computer extends Device{
    private int ramGb;

    public Computer(String manufacturer, int ramGb) {
        super(manufacturer);
        this.ramGb = ramGb;
    }

    public int getRamGb() {
        return ramGb;
    }

    public void addRam(int amount){
        this.ramGb += amount;
    }

    public void rmRam(int amount){
        if (amount <= this.ramGb){
            this.ramGb -= amount;
        }
    }

    @Override
    public String giveInfo(){
        return super.giveInfo() + "Current installed RAM (GB): %d\n".formatted(this.ramGb);
    }
}
