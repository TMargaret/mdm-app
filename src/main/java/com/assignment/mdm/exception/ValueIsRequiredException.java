package com.assignment.mdm.exception;

public class ValueIsRequiredException extends Exception {
    public ValueIsRequiredException() {
        super();
    }

    public ValueIsRequiredException(String message) {
        super(message);
    }

    public ValueIsRequiredException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValueIsRequiredException(String message, Object... args) {
        super(message, args);
    }

}
