package com.jmendoza.springboot.cleanarchitecture.adapter.repository;

import com.jmendoza.springboot.cleanarchitecture.domain.shape.Circle;
import com.jmendoza.springboot.cleanarchitecture.usecase.shape.port.CircleRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryCircleRepository implements CircleRepository {

    private final Map<String, Circle> inMemoryDb = new HashMap<>();

    @Override
    public Circle create(Circle circle) {
        inMemoryDb.put(circle.getId(), circle);
        return circle;
    }

    @Override
    public Optional<Circle> getById(String id) {
        return Optional.ofNullable(inMemoryDb.get(id));
    }
}