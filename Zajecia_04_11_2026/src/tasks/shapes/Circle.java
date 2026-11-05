package tasks.shapes;

public class Circle extends Shape {
    private double r;

    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }

    @Override
    public double area() {
        return 3.14 * (this.r * this.r);
    }
}
