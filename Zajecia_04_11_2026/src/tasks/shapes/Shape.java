package tasks.shapes;

public class Shape {
    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double area(){
        return 0.0;
    }

    public static void printShape(Shape shape){
        System.out.printf("This is a %s with area equal to %.2f\n",
                shape.getName(), shape.area());
    }

}
