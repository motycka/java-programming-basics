import com.harbourspace.model.Sensor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SensorTest {

  Sensor temperatureSensorCelsius = new Sensor("C", 25.0);
  Sensor temperatureSensorFahrenheit = new Sensor("F", 77.0);

  @Test
  @DisplayName("should validate unit")
  public void testError() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Sensor("X", 25.0));
  }

  @Test
  @DisplayName("should have isCelsius method")
  public void testIsCelsius() {
    Assertions.assertTrue(temperatureSensorCelsius.isCelsius());
    Assertions.assertFalse(temperatureSensorFahrenheit.isCelsius());
  }

  @Test
  @DisplayName("should have isFarhenheit method")
  public void testIsFahrenheit() {
    Assertions.assertTrue(temperatureSensorFahrenheit.isFahrenheit());
    Assertions.assertFalse(temperatureSensorCelsius.isFahrenheit());
  }

  @Test
  @DisplayName("should convert Fahrenheit to Celsius")
  public void testFahrenheitToCelsius() {
    Assertions.assertEquals(temperatureSensorCelsius, temperatureSensorFahrenheit.toCelsius());
  }

  @Test
  @DisplayName("should convert Celsius to Celsius - returns the same object")
  public void testCelsiusToCelsius() {
    Assertions.assertEquals(temperatureSensorCelsius, temperatureSensorCelsius.toCelsius());
  }

  @Test
  @DisplayName("should convert Celsius to Fahrenheit")
  public void testCelsiusToFahrenheit() {
    Assertions.assertEquals(temperatureSensorFahrenheit, temperatureSensorCelsius.toFahrenheit());
  }

  @Test
  @DisplayName("should convert Fahrenheit to Fahrenheit - returns the same object")
  public void testFahrenheitToFahrenheit() {
    Assertions.assertEquals(temperatureSensorFahrenheit, temperatureSensorFahrenheit.toFahrenheit());
  }

  @Test
  @DisplayName("should compare two sensors with same unit")
  public void testValueEqualsSameUnit() {
    Assertions.assertTrue(temperatureSensorCelsius.valueEquals(temperatureSensorCelsius));
    Assertions.assertFalse(new Sensor("C", 24.0).valueEquals(temperatureSensorCelsius));
  }

  @Test
  @DisplayName("should compare two sensors with different unit")
  public void testValueEqualsDifferentUnit() {
    Assertions.assertTrue(temperatureSensorCelsius.valueEquals(temperatureSensorFahrenheit));
  }

}
