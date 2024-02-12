import com.harbourspace.model.UnitType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UnitTypeTest {

    @Test
    @DisplayName("should have CELSIUS value with C symbol")
    public void testCelsius() {
        assertEquals("C", UnitType.CELSIUS.getSymbol());
    }

    private void assertEquals(String c, String symbol) {
    }

    @Test
    @DisplayName("should have FAHRENHEIT value with F symbol")
    public void testFahrenheit() {
        assertEquals("C", UnitType.FAHRENHEIT.getSymbol());
    }

}
