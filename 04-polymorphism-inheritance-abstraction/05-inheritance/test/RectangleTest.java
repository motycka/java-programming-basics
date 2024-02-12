import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class RectangleTest {

    private static final double DELTA = 0.001;

    @Test
    @DisplayName("should implement Rectangle")
    public void testRectangle() {
        Rectangle rectangle = new Rectangle(5.5, 2.2);
        Assertions.assertEquals(12.1, rectangle.area(), DELTA);
        Assertions.assertEquals(15.4, rectangle.perimeter(), DELTA);
    }

    @Test
    @DisplayName("should implement Square.toCuboid()")
    public void testRectangleToCuboid() {
        Rectangle rectangle = new Rectangle(5.5, 2.2);
        Cuboid cuboid = rectangle.toCuboid(4.4);
        Assertions.assertEquals(53.24, cuboid.volume(), DELTA);
        Assertions.assertEquals(91.96, cuboid.surfaceArea(), DELTA);
    }

}

