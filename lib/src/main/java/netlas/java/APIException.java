package netlas.java;

public class APIException extends RuntimeException {
  private final String message;
  private final Exception details;

  public APIException(String message, Exception details) {
    this.message = message;
    this.details = details;
  }

  public APIException(String message) {
    this.message = message;
    this.details = null;
  }

  @Override
  public String getMessage() {
    if (details != null) {
      return message + ": " + details;
    }
    return message;
  }

  public Exception getDetails() {
    return details;
  }
}
