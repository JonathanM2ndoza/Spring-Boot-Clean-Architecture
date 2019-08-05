package com.jmendoza.springboot.cleanarchitecture.adapter.controller.model;

import com.jmendoza.springboot.cleanarchitecture.domain.shape.Circle;

public class CircleWeb {
    private String id;
    private double radius;
    private double circumference;
    private double area;

    public CircleWeb(String id, double radius, double circumference, double area) {
        this.id = id;
        this.radius = radius;
        this.circumference = circumference;
        this.area = area;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public double getArea() {
        return area;
    }

    public Circle toCircle() {
        return new Circle(getId(), getRadius());
    }

    public static CircleWeb toCircleWeb(final Circle circle) {
        return new CircleWeb(circle.getId(), circle.getRadius(), circle.calculateCircumference(), circle.calculateArea());
    }
}
