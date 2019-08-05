package com.jmendoza.springboot.cleanarchitecture.usecase.shape.validator;

import com.jmendoza.springboot.cleanarchitecture.domain.shape.Circle;
import com.jmendoza.springboot.cleanarchitecture.usecase.shape.exception.CircleValidationException;

import static org.apache.commons.lang3.StringUtils.isBlank;

public class CircleValidator {

    public static void validateCreate(final Circle circle) {
        if (circle == null) throw new CircleValidationException("Circle should not be null");
        if (isBlank(String.valueOf(circle.getRadius())))
            throw new CircleValidationException("Radius should not be null");
        if (isBlank(String.valueOf(circle.getId())))
            throw new CircleValidationException("Id should not be null");
    }
}