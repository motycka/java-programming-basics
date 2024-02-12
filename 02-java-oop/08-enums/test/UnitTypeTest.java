import com.harbourspace.model.UnitType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTypeTest {

    @Test
    @DisplayName("should have CELSIUS value with C symbol")
    public void testCelsius() {
        assertEquals("C", UnitType.CELSIUS.getSymbol());
    }

    @Test
    @DisplayName("should have FAHRENHEIT value with F symbol")
    public void testFahrenheit() {
        assertEquals("F", UnitType.FAHRENHEIT.getSymbol());
    }

}
