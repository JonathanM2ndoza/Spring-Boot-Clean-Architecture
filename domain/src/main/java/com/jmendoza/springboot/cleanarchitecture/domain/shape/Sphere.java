package com.jmendoza.springboot.cleanarchitecture.domain.shape;

public class Sphere implements CircumferenceShape {

    public static final float FLOAT_PI = 3.14f;
    private String id;
    private double radius;

    public Sphere(String id, double radius) {
        this.id = id;
        this.radius = radius;
    }

    public String getId() {
        return id;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateCircumference() {
        return FLOAT_PI * 2 * radius;
    }

    @Override
    public double calculateArea() {
        return 4 * FLOAT_PI * radius * radius;
    }
}
