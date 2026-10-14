public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point otherPoint){
        return Math.sqrt(
                (this.x - otherPoint.x)*(this.x - otherPoint.x) + (this.y - otherPoint.y)*(this.y - otherPoint.y));
    }
}
