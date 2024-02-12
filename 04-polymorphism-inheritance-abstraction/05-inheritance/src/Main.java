public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());

        Square square = new Square(5);
        System.out.println("Square area: " + square.area());
        System.out.println("Square perimeter: " + square.perimeter());

        // Creating a cube from a square
        Cuboid cube = square.toCube();
        System.out.println("Cube volume: " + cube.volume());
        System.out.println("Cube surface area: " + cube.surfaceArea());

        // Creating a cuboid from a square
        Cuboid cuboid = square.toCuboid(4);
        System.out.println("Cuboid volume: " + cuboid.volume());
        System.out.println("Cuboid surface area: " + cuboid.surfaceArea());
    }

}
