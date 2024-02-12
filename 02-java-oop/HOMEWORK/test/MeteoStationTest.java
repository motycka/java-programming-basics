import com.harbourspace.model.MeteoStation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MeteoStationTest {

  private final String name = "Meteo Test";
  private final Double[] position = {49.123456, 16.123456};

  @Test
  @DisplayName("test class primary constructor")
  public void testClassPrimaryConstructor() {
    MeteoStation meteoStation = new MeteoStation(name, position);
    assertEquals(name, meteoStation.getName());
    assertEquals(position, meteoStation.getPosition());
    assertNotNull(meteoStation.getVersionInfo().getFirmware());
    assertFalse(meteoStation.getVersionInfo().getFirmware().isEmpty());
  }

  @Test
  @DisplayName("test class secondary constructor")
  public void testClassSecondaryConstructor() {
    MeteoStation meteoStation = new MeteoStation(name);
    assertEquals(name, meteoStation.getName());
    assertNull(meteoStation.getPosition());
  }

  @Test
  @DisplayName("test position setter")
  public void testPositionSetter() {
    MeteoStation meteoStation = new MeteoStation(name);
    assertEquals(name, meteoStation.getName());
    assertNull(meteoStation.getPosition());

    meteoStation.setPosition(position);
    assertEquals(position, meteoStation.getPosition());
  }

}
