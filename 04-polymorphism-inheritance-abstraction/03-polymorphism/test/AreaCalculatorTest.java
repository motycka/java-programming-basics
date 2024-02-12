import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AreaCalculatorTest {

  private static final double DELTA = 0.001;

  @Test
  @DisplayName("should calculate rectangle area as int")
  public void testRectangleAreaInt() {
    Assertions.assertEquals(6, AreaCalculator.calculateRectangleArea(2, 3), DELTA);
  }

  @Test
  @DisplayName("should calculate rectangle area as double")
  public void testRectangleAreaDouble() {
    Assertions.assertEquals(7.36, AreaCalculator.calculateRectangleArea(2.3, 3.2), DELTA);
  }

  @Test
  @DisplayName("should calculate circle area as int")
  public void testCircleAreaInt() {
    Assertions.assertEquals(28.2743, AreaCalculator.calculateCircleArea(3), DELTA);
  }

  @Test
  @DisplayName("should calculate circle area as double")
  public void testCircleAreaDouble() {
    Assertions.assertEquals(32.17, AreaCalculator.calculateCircleArea(3.2), DELTA);
  }

  @Test
  @DisplayName("should calculate triangle area as int")
  public void testTriangleAreaInt() {
    Assertions.assertEquals(3, AreaCalculator.calculateTriangleArea(3, 2), DELTA);
  }

  @Test
  @DisplayName("should calculate triangle area as double")
  public void testTriangleAreaDouble() {
    Assertions.assertEquals(3.68, AreaCalculator.calculateTriangleArea(3.2, 2.3), DELTA);
  }

}
