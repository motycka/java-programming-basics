public class AuthorizationHandler {

    private Status currentStatus = Status.UNAUTHORIZED;
    private final long maxAttempts = 3;
    private byte attempts = 0;

    public void authorize(String username, String password) {
        if (currentStatus != Status.LOCKED && username.equals(Credentials.username) && password.equals(Credentials.password)) {
            currentStatus = Status.AUTHORIZED;
            attempts = 0;
        } else {
            if (attempts < maxAttempts - 1) {
                currentStatus = Status.UNAUTHORIZED;
                attempts++;
            } else {
                currentStatus = Status.LOCKED;
            }
        }
    }

    public void unAuthorize() {
        // this is intentional bug, it should not set to UNAUTHORIZED if current status is LOCKED
        currentStatus = Status.UNAUTHORIZED;
    }

    public Status getStatus() {
        return currentStatus;
    }

    public enum Status {
        AUTHORIZED, UNAUTHORIZED, LOCKED
    }

    private static class Credentials {
        private static final String username = "user";
        private static final String password = "secret";
    }

}
