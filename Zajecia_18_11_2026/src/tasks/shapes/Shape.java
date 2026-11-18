package tasks.shapes;

public abstract class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
        System.out.println("Shape contructor running");
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public void printInformation(){
        System.out.printf("This is a %s. \nIt's area is equal to: %.2f\n", this.getName(), this.area());
    }

}
