package com.jmendoza.springboot.cleanarchitecture.usecase.shape;

import com.jmendoza.springboot.cleanarchitecture.domain.shape.Circle;
import com.jmendoza.springboot.cleanarchitecture.usecase.shape.port.CircleRepository;

import java.util.Optional;

public class GetCircle {

    private CircleRepository circleRepository;

    public GetCircle(CircleRepository circleRepository) {
        this.circleRepository = circleRepository;
    }

    public Optional<Circle> get(String id) {
        return circleRepository.getById(id);
    }
}
