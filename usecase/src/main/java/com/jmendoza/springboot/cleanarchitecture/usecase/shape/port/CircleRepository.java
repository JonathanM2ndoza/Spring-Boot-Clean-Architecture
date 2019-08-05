package com.jmendoza.springboot.cleanarchitecture.usecase.shape.port;

import com.jmendoza.springboot.cleanarchitecture.domain.shape.Circle;

import java.util.Optional;

public interface CircleRepository {

    Circle create(Circle circle);

    Optional<Circle> getById(String id);
}