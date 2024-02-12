public class Cuboid implements Shape3D {
    protected double width;
    protected double height;
    protected double length;

    public Cuboid(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double volume() {
        return width * height * length;
    }

    public double surfaceArea() {
        return 2 * (width * height + width * length + height * length);
    }

}

