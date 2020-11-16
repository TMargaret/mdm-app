package com.assignment.mdm.exception;

public class DoesNotExistException extends Exception {

    public DoesNotExistException() {
        super();
    }

    public DoesNotExistException(String message) {
        super(message);
    }

    public DoesNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public DoesNotExistException(String message, Object... args) {
        super(message, args);
    }
}
