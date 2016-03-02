package org.rekdev.shapes;

public class MyIllegalArgumentException extends Exception {
  private static final long serialVersionUID = 1L;

  public MyIllegalArgumentException() {
    super();
  }

  public MyIllegalArgumentException(String message, Throwable cause, boolean enableSuppression,
      boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

  public MyIllegalArgumentException(String message, Throwable cause) {
    super(message, cause);
  }

  public MyIllegalArgumentException(String message) {
    super(message);
  }

  public MyIllegalArgumentException(Throwable cause) {
    super(cause);
  }

}
