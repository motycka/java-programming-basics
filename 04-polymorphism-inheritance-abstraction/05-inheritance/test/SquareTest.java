import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class SquareTest {

    private static final double DELTA = 0.001;

    @Test
    @DisplayName("Square should extend Rectangle")
    public void testAbstractShape() {
        Rectangle square = new Square(5.5);
        Assertions.assertInstanceOf(Rectangle.class, square);
        Assertions.assertEquals(30.25, square.area(), DELTA);
        Assertions.assertEquals(22, square.perimeter(), DELTA);
    }

    @Test
    @DisplayName("should implement Square")
    public void testSquare() {
        Square square = new Square(5.5);
        Assertions.assertEquals(30.25, square.area(), DELTA);
        Assertions.assertEquals(22, square.perimeter(), DELTA);
    }

    @Test
    @DisplayName("should implement Square.toCuboid()")
    public void testSquareToCuboid() {
        Square square = new Square(5.5);
        Cuboid cube = square.toCuboid(5.5);
        Assertions.assertEquals(166.375, cube.volume(), DELTA);
        Assertions.assertEquals(181.5, cube.surfaceArea(), DELTA);
    }

    @Test
    @DisplayName("should implement Square.toCube()")
    public void testSquareToCube() {
        Square square = new Square(5.5);
        Cuboid cube = square.toCube();
        Assertions.assertEquals(166.375, cube.volume(), DELTA);
        Assertions.assertEquals(181.5, cube.surfaceArea(), DELTA);
    }
}

