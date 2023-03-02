package netlas.java;

/** An exception that represents an error response from the Netlas API. */
public class ApiException extends RuntimeException {
  private final String message;
  private final Exception details;

  /**
   * Constructs a new APIException with the specified message and details.
   *
   * @param message the message to display
   * @param details the cause of the exception
   */
  public ApiException(String message, Exception details) {
    this.message = message;
    this.details = details;
  }

  /**
   * Constructs a new APIException with the specified message.
   *
   * @param message the message to display
   */
  public ApiException(String message) {
    this.message = message;
    this.details = null;
  }

  /**
   * Returns the error message for this exception, including any details if available.
   *
   * @return the error message
   */
  @Override
  public String getMessage() {
    if (details != null) {
      return message + ": " + details;
    }
    return message;
  }

  /**
   * Returns the details of this exception, if available.
   *
   * @return the details of the exception, or null if not available
   */
  public Exception getDetails() {
    return details;
  }
}
