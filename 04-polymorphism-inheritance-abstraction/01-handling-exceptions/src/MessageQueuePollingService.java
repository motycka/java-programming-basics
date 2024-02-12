public class MessageQueuePollingService {

    private final MessageQueue messageQueue;

    MessageQueuePollingService(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    public void connectAndPoll() {

        try {
            messageQueue.connect();

            try {
                String message = messageQueue.pollMessage();
                System.out.println("Message: " + message);

            } catch (MessageQueueConnectionException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Handling connection exception ... ");

            } catch (MessageQueueRuntimeException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Handling runtime exception ... ");

            } finally {
                messageQueue.disconnect();
            }

        } catch (MessageQueueConnectionException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
