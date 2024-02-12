import com.harbourspace.model.Sensor;
import com.harbourspace.model.SensorType;
import com.harbourspace.model.UnitType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SensorTest {

    Sensor temperatureTemperatureSensorCelsius = new Sensor(SensorType.TEMPERATURE, UnitType.CELSIUS, 25.0);
    Sensor temperatureTemperatureSensorFahrenheit = new Sensor(SensorType.TEMPERATURE, UnitType.FAHRENHEIT, 77.0);
    Sensor humiditySensor = new Sensor(SensorType.HUMIDITY, UnitType.PERCENT, 60.0);
    Sensor precipitationSensor = new Sensor(SensorType.PRECIPITATION, UnitType.MILLIMETER, 12.3);

    @Test
    @DisplayName("should have isCelsius method")
    public void testIsCelsius() {
        Assertions.assertTrue(temperatureTemperatureSensorCelsius.isCelsius());
        Assertions.assertFalse(temperatureTemperatureSensorFahrenheit.isCelsius());
        Assertions.assertFalse(humiditySensor.isCelsius());
        Assertions.assertFalse(precipitationSensor.isCelsius());
    }

    @Test
    @DisplayName("should have isFarhenheit method")
    public void testIsFahrenheit() {
        Assertions.assertTrue(temperatureTemperatureSensorFahrenheit.isFahrenheit());
        Assertions.assertFalse(temperatureTemperatureSensorCelsius.isFahrenheit());
        Assertions.assertFalse(humiditySensor.isFahrenheit());
        Assertions.assertFalse(precipitationSensor.isFahrenheit());
    }

    @Test
    @DisplayName("should convert Fahrenheit to Celsius")
    public void testFahrenheitToCelsius() {
        Assertions.assertEquals(temperatureTemperatureSensorCelsius, temperatureTemperatureSensorFahrenheit.toCelsius());
    }

    @Test
    @DisplayName("should convert Celsius to Celsius - returns the same object")
    public void testCelsiusToCelsius() {
        Assertions.assertEquals(temperatureTemperatureSensorCelsius, temperatureTemperatureSensorCelsius.toCelsius());
    }

    @Test
    @DisplayName("should convert Celsius to Fahrenheit")
    public void testCelsiusToFahrenheit() {
        Assertions.assertEquals(temperatureTemperatureSensorFahrenheit, temperatureTemperatureSensorCelsius.toFahrenheit());
    }

    @Test
    @DisplayName("should convert Fahrenheit to Fahrenheit - returns the same object")
    public void testFahrenheitToFahrenheit() {
        Assertions.assertEquals(temperatureTemperatureSensorFahrenheit, temperatureTemperatureSensorFahrenheit.toFahrenheit());
    }

    @Test
    @DisplayName("should compare two temperature sensors with same unit")
    public void testValueEqualsSameUnit() {
        Assertions.assertTrue(temperatureTemperatureSensorCelsius.valueEquals(temperatureTemperatureSensorCelsius));
        Assertions.assertFalse(new Sensor(SensorType.TEMPERATURE, UnitType.CELSIUS, 24.0).valueEquals(temperatureTemperatureSensorCelsius));
    }

    @Test
    @DisplayName("should compare two temperature sensors with different unit")
    public void testValueEqualsDifferentUnit() {
        Assertions.assertTrue(temperatureTemperatureSensorCelsius.valueEquals(temperatureTemperatureSensorFahrenheit));
    }

    @Test
    @DisplayName("should not allow to convert humidity to temperature")
    public void testConversionOfHumidityToTemperature() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            humiditySensor.toCelsius();
        });
    }

    @Test
    @DisplayName("should not allow to convert precipitation to temperature")
    public void testConversionOfPrecipitationToHumidity() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            precipitationSensor.toCelsius();
        });
    }

    @Test
    @DisplayName("should not allow to instantiate temperature with %")
    public void testCreateInvalidUnitTemperature1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Sensor(SensorType.TEMPERATURE, UnitType.PERCENT, 0.0);
        });
    }

    @Test
    @DisplayName("should not allow to instantiate temperature with mm")
    public void testCreateInvalidUnitTemperature2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Sensor(SensorType.TEMPERATURE, UnitType.MILLIMETER, 0.0);
        });
    }


    @Test
    @DisplayName("should not allow to instantiate humidity with C")
    public void testCreateInvalidUnitHumidity1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Sensor(SensorType.HUMIDITY, UnitType.CELSIUS, 0.0);
        });
    }

    @Test
    @DisplayName("should not allow to instantiate humidity F")
    public void testCreateInvalidUnitHumidity2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Sensor(SensorType.HUMIDITY, UnitType.FAHRENHEIT, 0.0);
        });
    }

    @Test
    @DisplayName("should not allow to instantiate humidity with mm")
    public void testCreateInvalidUnitHumidity3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Sensor(SensorType.HUMIDITY, UnitType.MILLIMETER, 0.0);
        });
    }

    @Test
    @DisplayName("should not allow to instantiate precipitation with C")
    public void testCreateInvalidUnitPrecipitation1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Sensor(SensorType.PRECIPITATION, UnitType.CELSIUS, 0.0);
        });
    }

    @Test
    @DisplayName("should not allow to instantiate precipitation with F")
    public void testCreateInvalidUnitPrecipitation2() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Sensor(SensorType.PRECIPITATION, UnitType.FAHRENHEIT, 0.0);
        });
    }

    @Test
    @DisplayName("should not allow to instantiate precipitation with %")
    public void testCreateInvalidUnitPrecipitation3() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Sensor(SensorType.PRECIPITATION, UnitType.PERCENT, 0.0);
        });
    }

}
