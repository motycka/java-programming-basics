import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AuthorizationHandlerTest {

  private static final String USERNAME = "user";
  private static final String PASSWORD = "secret";
  private static final String INVALID_PASSWORD = "invalid";

  @Test
  @DisplayName("should authorize on 1st attempt")
  public void testAuthorization1() {
    AuthorizationHandler service = new AuthorizationHandler();

    service.authorize(USERNAME, PASSWORD);
    Assertions.assertEquals(AuthorizationHandler.Status.AUTHORIZED, service.getStatus());
  }

  @Test
  @DisplayName("should authorize on 2nd attempt")
  public void testAuthorization2() {
    AuthorizationHandler service = new AuthorizationHandler();

    service.authorize(USERNAME, INVALID_PASSWORD);
    Assertions.assertEquals(AuthorizationHandler.Status.UNAUTHORIZED, service.getStatus());

    service.authorize(USERNAME, PASSWORD);
    Assertions.assertEquals(AuthorizationHandler.Status.AUTHORIZED, service.getStatus());
  }

  @Test
  @DisplayName("should authorize on 3rd attempt")
  public void testAuthorization3() {
    AuthorizationHandler service = new AuthorizationHandler();

    service.authorize(USERNAME, INVALID_PASSWORD);
    Assertions.assertEquals(AuthorizationHandler.Status.UNAUTHORIZED, service.getStatus());

    service.authorize(USERNAME, INVALID_PASSWORD);
    Assertions.assertEquals(AuthorizationHandler.Status.UNAUTHORIZED, service.getStatus());

    service.authorize(USERNAME, PASSWORD);
    Assertions.assertEquals(AuthorizationHandler.Status.AUTHORIZED, service.getStatus());
  }

  @Test
  @DisplayName("should lock on 3rd failed attempt")
  public void testAuthorization4() {
    AuthorizationHandler service = new AuthorizationHandler();

    service.authorize(USERNAME, INVALID_PASSWORD);
    Assertions.assertEquals(AuthorizationHandler.Status.UNAUTHORIZED, service.getStatus());

    service.authorize(USERNAME, INVALID_PASSWORD);
    Assertions.assertEquals(AuthorizationHandler.Status.UNAUTHORIZED, service.getStatus());

    service.authorize(USERNAME, INVALID_PASSWORD);
    Assertions.assertEquals(AuthorizationHandler.Status.LOCKED, service.getStatus());
  }

  @Test
  @DisplayName("should unAuthorize if AUTHORIZED")
    public void testUnauthorize() {
        AuthorizationHandler service = new AuthorizationHandler();

        service.authorize(USERNAME, PASSWORD);
        Assertions.assertEquals(AuthorizationHandler.Status.AUTHORIZED, service.getStatus());

        service.unAuthorize();
        Assertions.assertEquals(AuthorizationHandler.Status.UNAUTHORIZED, service.getStatus());
    }

  @Test
  @DisplayName("should not unAuthorize if LOCKED")
  public void testUnauthorize2() {
    AuthorizationHandler service = new AuthorizationHandler();

    service.authorize(USERNAME, INVALID_PASSWORD);
    service.authorize(USERNAME, INVALID_PASSWORD);
    service.authorize(USERNAME, INVALID_PASSWORD);
    Assertions.assertEquals(AuthorizationHandler.Status.LOCKED, service.getStatus());

    service.unAuthorize();
    // this is a bug found by the test
    Assertions.assertEquals(AuthorizationHandler.Status.LOCKED, service.getStatus());
  }

  @Test
  @DisplayName("should reset attempt counter on unAuthorize if AUTHORIZED")
  public void testUnauthorizeResteCounterAuthorized() {
    AuthorizationHandler service = new AuthorizationHandler();

    service.authorize(USERNAME, INVALID_PASSWORD);
    service.authorize(USERNAME, INVALID_PASSWORD);
    service.authorize(USERNAME, PASSWORD);
    Assertions.assertEquals(AuthorizationHandler.Status.AUTHORIZED, service.getStatus());

    service.authorize(USERNAME, INVALID_PASSWORD);
    service.authorize(USERNAME, INVALID_PASSWORD);
    service.authorize(USERNAME, PASSWORD);
    Assertions.assertEquals(AuthorizationHandler.Status.AUTHORIZED, service.getStatus());
  }

}
