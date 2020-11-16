package com.assignment.mdm.exception;

import java.io.Serializable;
import java.text.MessageFormat;

public class Exception extends RuntimeException implements
        Serializable {

    private static final long serialVersionUID = 4808786528779863568L;

    protected Exception() {
    }

    protected Exception(String message) {
        super(message);
    }

    protected Exception(String message, Object... args) {
        super(MessageFormat.format(message, args));
    }

    protected Exception(String message, Throwable cause) {
        super(message, cause);
    }

    protected Exception(Throwable cause) {
        super(cause);
    }

    protected Exception(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
