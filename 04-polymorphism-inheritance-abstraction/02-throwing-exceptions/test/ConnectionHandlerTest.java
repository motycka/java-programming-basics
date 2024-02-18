import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConnectionHandlerTest {
  @Test
  @DisplayName("should not throw when connected")
  public void testConnected() {
    ConnectionHandler connectionHandler = new ConnectionHandler();
    connectionHandler.connect();
    Assertions.assertDoesNotThrow(connectionHandler::ping);
  }

  @Test
  @DisplayName("should throw when not connected")
  public void testNotConnected() {
    ConnectionHandler connectionHandler = new ConnectionHandler();
    Assertions.assertThrows(ConnectionException.class, connectionHandler::ping);
  }

  @Test
  @DisplayName("ConnectionException should accept message")
  public void testExceptionMessage() {
    ConnectionException connectionException = new ConnectionException("Not connected");
    Assertions.assertEquals("Not connected", connectionException.getMessage());
  }
}
