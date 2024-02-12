import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MessageQueueServiceTest {

  @Test
  @DisplayName("should connect, poll and disconnect")
  public void testSolution() {
    MessageQueue messageQueue = spy(new MessageQueue());
    MessageQueuePollingService service = new MessageQueuePollingService(messageQueue);

    service.connectAndPoll();

    try {
        verify(messageQueue, times(1)).connect();
        verify(messageQueue, times(1)).pollMessage();
        verify(messageQueue, times(1)).disconnect();
    } catch (MessageQueueConnectionException e) {
      Assertions.fail("Unhandled exception: " + e.getClass().getSimpleName());
    }
  }

  @Test
  @DisplayName("should handle connection error")
  public void testConnectionError() {
    MessageQueue messageQueue = spy(new TestableMessageQueue(true, false));
    MessageQueuePollingService service = new MessageQueuePollingService(messageQueue);

    service.connectAndPoll();

    try {
      verify(messageQueue, times(1)).connect();
      verify(messageQueue, never()).pollMessage();
      verify(messageQueue, never()).disconnect();
    } catch (MessageQueueConnectionException e) {
      Assertions.fail("Unhandled exception: " + e.getClass().getSimpleName());
    }
  }

  @Test
  @DisplayName("should handle poll error")
  public void testPushError() {
    MessageQueue messageQueue = spy(new TestableMessageQueue(false, true));
    MessageQueuePollingService service = new MessageQueuePollingService(messageQueue);

    service.connectAndPoll();

    try {
      verify(messageQueue, times(1)).connect();
      verify(messageQueue, times(1)).pollMessage();
      verify(messageQueue, times(1)).disconnect();
    } catch (MessageQueueConnectionException e) {
      Assertions.fail("Unhandled exception: " + e.getClass().getSimpleName());
    }
  }

  static class TestableMessageQueue extends MessageQueue {
    public TestableMessageQueue(boolean failConnect, boolean failPoll) {
      super(failConnect, failPoll);
    }
  }
}

