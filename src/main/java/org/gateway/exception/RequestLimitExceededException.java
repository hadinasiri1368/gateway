package org.gateway.exception;

public class RequestLimitExceededException extends RuntimeException {
    public RequestLimitExceededException(String message) {
        super(message);
    }
}

