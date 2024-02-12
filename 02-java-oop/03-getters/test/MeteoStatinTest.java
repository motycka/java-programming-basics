import com.harbourspace.Main;
import com.harbourspace.model.MeteoStation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeteoStatinTest {

//  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//  private final PrintStream originalOut = System.out;
  private final String expectedName = "Meteo station on Campus";

  @Test
  @DisplayName("test class")
  public void testClass() {
    MeteoStation meteoStation = new MeteoStation(expectedName);
    assertEquals(expectedName, meteoStation.getName());
  }

//  @Test
//  @DisplayName("test output")
//  public void testOutput() {
//    System.setOut(new PrintStream(outContent));
//
//    String[] args = {};
//    Main.main(args);
//
//    assertEquals(expectedName, outContent.toString().trim());
//
//    System.setOut(originalOut);
//  }

}
