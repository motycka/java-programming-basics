public class Rectangle  {

    protected double width;
    protected double height;

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
