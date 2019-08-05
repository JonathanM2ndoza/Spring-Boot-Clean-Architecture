package com.jmendoza.springboot.cleanarchitecture.usecase.shape.exception;

public class CircleValidationException extends RuntimeException {
    public CircleValidationException(final String message) {
        super(message);
    }
}
