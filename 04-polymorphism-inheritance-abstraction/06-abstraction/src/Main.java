public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());

        Square square = new Square(5);
        System.out.println("Square area: " + square.area());
        System.out.println("Square perimeter: " + square.perimeter());

        Circle circle = new Circle(4);
        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " + circle.perimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle perimeter: " + triangle.perimeter());

        Cuboid cube = square.toCube();
        System.out.println("Cube volume: " + cube.volume());
        System.out.println("Cube surface area: " + cube.surfaceArea());

        Cuboid cuboid = rectangle.toCuboid(4);
        System.out.println("Cuboid volume: " + cuboid.volume());
        System.out.println("Cuboid surface area: " + cuboid.surfaceArea());
    }

}
