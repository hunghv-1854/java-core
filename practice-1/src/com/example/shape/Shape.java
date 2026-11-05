package com.example.shape;

public abstract class Shape {
    protected double width;
    protected double height;

    protected Shape(double width, double height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Kích thước không được âm");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth()  { return width; }
    public double getHeight() { return height; }

        public abstract double getArea();

        public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("%s[width=%.2f, height=%.2f, area=%.2f]",
                getName(), width, height, getArea());
    }
}
