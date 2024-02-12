package com.harbourspace.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MeteoStationTest {

  @Test
  public void testSolution() {
    MeteoStation meteoStation = new MeteoStation();
    Assertions.assertEquals("Meteo station on Campus", meteoStation.name);
  }

}
