public class ConnectionHandler {

    public void connect() {
        // put your code here
    }

    public void ping() {
        // put your code here
    }

}
class ConnectionException extends Throwable {
    public ConnectionException(String message) {
        super(message);
    }
}

class NetworkException extends RuntimeException {
    public NetworkException(String message) {
        super(message);
    }
}
