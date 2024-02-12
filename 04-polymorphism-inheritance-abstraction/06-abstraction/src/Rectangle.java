public class Rectangle implements Shape2D {

    protected final double width;
    protected final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public Cuboid toCuboid(double length) {
        return new Cuboid(this.width, this.height, length);
    }

}
