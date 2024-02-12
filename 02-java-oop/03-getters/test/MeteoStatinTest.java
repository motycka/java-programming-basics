import com.harbourspace.model.MeteoStation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeteoStatinTest {

  private final String expectedName = "Meteo station on Campus";

  @Test
  @DisplayName("test class")
  public void testClass() {
    MeteoStation meteoStation = new MeteoStation(expectedName);
    assertEquals(expectedName, meteoStation.getName());
  }

}
