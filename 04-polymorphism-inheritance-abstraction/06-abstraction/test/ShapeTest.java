import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShapeTest {
  @Test
  @DisplayName("should create Rectangle")
  public void testRectangle() {
    Rectangle rectangle = new Rectangle(2, 3);
    Assertions.assertEquals(6, rectangle.area());
    Assertions.assertEquals(10, rectangle.perimeter());
  }

  @Test
  @DisplayName("should create Square")
  public void testSquare() {
    Square square = new Square(5);
    Assertions.assertEquals(25.0, square.area());
    Assertions.assertEquals(20, square.perimeter());
  }

  @Test
  @DisplayName("should create Circle")
  public void testCircle() {
    Circle circle = new Circle(4);
    Assertions.assertEquals(50.26548245743669, circle.area());
    Assertions.assertEquals(25.132741228718345, circle.perimeter());
  }

  @Test
  @DisplayName("should create Triangle")
  public void testTriangle() {
    Triangle triangle = new Triangle(3, 4, 5);
    Assertions.assertEquals(6.0, triangle.area());
    Assertions.assertEquals(12.0, triangle.perimeter());
  }

  @Test
  @DisplayName("should create Cuboid")
  public void testCuboid() {
    Rectangle rectangle = new Rectangle(2, 3);
    Cuboid cuboid = rectangle.toCuboid(4);
    Assertions.assertEquals(6.0, rectangle.area());
    Assertions.assertEquals(10.0, rectangle.perimeter());
  }
}
