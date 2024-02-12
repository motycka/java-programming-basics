import com.harbourspace.model.Sensor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SensorTest {

  @Test
  @DisplayName("should instantiate Sensor")
  public void testSensor() {
    Assertions.assertInstanceOf(Sensor.class, new Sensor("C", 25.0));
  }

  @Test
  @DisplayName("should validate unit")
  public void testError() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Sensor("X", 25.0));
  }

}
