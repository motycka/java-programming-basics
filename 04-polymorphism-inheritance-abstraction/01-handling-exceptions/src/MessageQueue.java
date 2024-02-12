public class MessageQueue {

    private static final String OK = "OK";
    private boolean isConnected = false;
    private final boolean failConnect;
    private final boolean failPoll;
    private final MessageQueueConnectionException messageQueueConnectionException = new MessageQueueConnectionException("Message queue is not connected.");
    private final MessageQueueRuntimeException messageQueueRuntimeException = new MessageQueueRuntimeException("Error while processing message.");

    public MessageQueue() {
        this.failConnect = false;
        this.failPoll = false;
    }

    protected MessageQueue(boolean failConnect, boolean failPush) {
        this.failConnect = failConnect;
        this.failPoll = failPush;
    }

    public void connect() throws MessageQueueConnectionException {
        if (failConnect) throw messageQueueConnectionException;
        this.isConnected = true;
    }

    public void disconnect() {
        this.isConnected = false;
    }

    public String pollMessage() throws MessageQueueConnectionException {
        if (!isConnected) throw messageQueueConnectionException;
        if (failPoll) throw messageQueueRuntimeException;
        return OK;
    }
}

