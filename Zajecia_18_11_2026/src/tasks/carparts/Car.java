package tasks.carparts;

public class Car {
    Engine engine;
    Gearbox gearbox;

    public void start(){
        this.engine.setIsRunning(true);
    }
}
