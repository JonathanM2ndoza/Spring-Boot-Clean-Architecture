package com.jmendoza.springboot.cleanarchitecture.usecase.shape;

import com.jmendoza.springboot.cleanarchitecture.domain.shape.Circle;
import com.jmendoza.springboot.cleanarchitecture.usecase.shape.port.CircleRepository;
import com.jmendoza.springboot.cleanarchitecture.usecase.shape.validator.CircleValidator;

public final class CreateCircle {

    private CircleRepository circleRepository;

    public CreateCircle(final CircleRepository circleRepository) {
        this.circleRepository = circleRepository;
    }

    public Circle create(final Circle circle) {
        CircleValidator.validateCreate(circle);
        return circleRepository.create(circle);
    }
}
