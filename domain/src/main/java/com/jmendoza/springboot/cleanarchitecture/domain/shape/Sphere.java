package com.jmendoza.springboot.cleanarchitecture.domain.shape;

import com.jmendoza.springboot.cleanarchitecture.domain.printer.Printer;

public class Sphere implements CircumferenceShape {

    private int id;
    private double radius;
    private Printer printer;

    public Sphere(int id, double radius, Printer printer) {
        this.id = id;
        this.radius = radius;
        this.printer = printer;
    }

    public int getId() {
        return id;
    }

    @Override
    public void calculateCircumference() {
        printer.printValue(String.valueOf(3.14f * 2 * radius));
    }

    @Override
    public void calculateArea() {
        printer.printValue(String.valueOf(4 * 3.14f * radius * radius));
    }
}
