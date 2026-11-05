package tasks.shapes;

public class Triangle extends Shape {
    private double a;
    private double h;

    public Triangle(String name, double a, double h) {
        super(name);
        this.a = a;
        this.h = h;
    }

    @Override
    public double area() {
        return (this.a * this.h)/2;
    }
}
