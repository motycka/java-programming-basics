import com.harbourspace.model.UnitType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UnitTypeTest {

    @Test
    @DisplayName("should have CELSIUS value with C symbol")
    public void testCelsius() {
        Assertions.assertEquals("C", UnitType.CELSIUS.getSymbol());
    }

    @Test
    @DisplayName("should have FAHRENHEIT value with F symbol")
    public void testFahrenheit() {
        Assertions.assertEquals("F", UnitType.FAHRENHEIT.getSymbol());
    }

}
