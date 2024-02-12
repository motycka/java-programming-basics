import com.harbourspace.Main;
import com.harbourspace.model.MeteoStation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MeteoStationTest {

//  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//  private final PrintStream originalOut = System.out;

  private final String name = "Meteo Test";
  private final Double[] position = {49.123456, 16.123456};

  @Test
  @DisplayName("test class primary constructor")
  public void testClassPrimaryConstructor() {
    String name = "Meteo test 1";
    MeteoStation meteoStation = new MeteoStation(name, position);
    assertEquals(name, meteoStation.getName());
    assertEquals(position, meteoStation.getPosition());
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

//  @Test
//  @DisplayName("test main output")
//  public void testOutput() {
//    System.setOut(new PrintStream(outContent));
//
//    String expectedOutput = "Name: " + Main.name1 + "\n" +
//            "Latitude: " + Main.position1[0] + "\n" +
//            "Longitude: " + Main.position1[1] + "\n" +
//            "Name: " + Main.name2 + "\n" +
//            "Latitude: " + Main.position2[0] + "\n" +
//            "Longitude: " + Main.position2[1];
//
//    String[] args = {};
//    Main.main(args);
//
//    assertEquals(expectedOutput, outContent.toString().trim());
//
//    System.setOut(originalOut);
//  }
}
