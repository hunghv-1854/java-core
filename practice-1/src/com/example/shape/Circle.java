package com.example.shape;

public class Circle extends Shape {

    public Circle(double radius) {
        super(radius * 2, radius * 2);
    }

    public double getRadius()   { return width / 2; }
    public double getDiameter() { return width; }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public double getCircumference() {
        return getDiameter() * 3.14;
    }

    @Override
    public String toString() {
        return String.format("Circle[radius=%.2f, diameter=%.2f, area=%.2f, circumference=%.2f]",
                getRadius(), getDiameter(), getArea(), getCircumference());
    }
}
