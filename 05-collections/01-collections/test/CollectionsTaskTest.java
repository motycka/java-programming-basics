import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class CollectionsTaskTest {

  @Test
  @DisplayName("should get temperatures on days")
  public void testGetTemperatures() {
    Map<String, Double> expected = Map.of(
            "2024-02-19", 19.2,
            "2024-02-20", 20.1,
            "2024-02-21", 22.5,
            "2024-02-22", 25.4,
            "2024-02-23", 28.2,
            "2024-02-24", 26.1,
            "2024-02-25", 24.0,
            "2024-02-26", 21.9,
            "2024-02-27", 25.0,
            "2024-02-28", 27.2
    );

    Assertions.assertEquals(expected, CollectionsTask.getTemperatures());
  }

  @Test
  @DisplayName("should get temperatures between values")
  public void testGetTemperaturesBetween() {
    Map<String, Double> data = CollectionsTask.getTemperatures();
    Map<String, Double> expectedBetween = Map.of(
            "2024-02-21", 22.5,
            "2024-02-22", 25.4,
            "2024-02-25", 24.0,
            "2024-02-27", 25.0
    );

    Assertions.assertEquals(expectedBetween, CollectionsTask.getTemperaturesBetween(data, 22.5, 25.4));
  }

}
