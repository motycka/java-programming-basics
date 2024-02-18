public class ConnectionHandler {

    private boolean connected = false;

    public void connect() {
        connected = true;
    }

    public void ping() throws ConnectionException {
        if (!connected) {
            throw new ConnectionException("Not connected");
        }
    }

}

