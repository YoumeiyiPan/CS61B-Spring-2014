package lab06;

/* BadTransactionException.java */

/**
 *  Implements an exception that should be thrown for invalid amount.
 **/
public class BadTransactionException extends Exception {
  /**
   *  Creates an exception object for nonexistent account "badAmount".
   **/
  public BadTransactionException(String problem) {
    super(problem);
  }
}