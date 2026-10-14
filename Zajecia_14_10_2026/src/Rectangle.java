public class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(0.0, 0.0);
    }

    public Rectangle(double size) {
        this(size, size);
    }

    public Rectangle(Rectangle other) {
        this(other.width, other.height);
    }

    public double area(){
        return this.width * this.height;
    }

    public double perimeter(){
        return 2*this.width + 2* this.height;
    }

    public void scale(double factor){
        this.width *= factor;
        this.height *= factor;
    }

    public void show(){
        System.out.printf("Width: %.2f \nHeight: %.2f \nArea: %.2f \nPerimeter: %.2f\n\n",
                this.width,
                this.height,
                this.area(),
                this.perimeter());
    }
}
