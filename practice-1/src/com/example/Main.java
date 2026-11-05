package com.example;

import com.example.shape.Circle;
import com.example.shape.Rectangle;
import com.example.shape.Shape;
import com.example.shape.Square;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(3, 4) {
            @Override
            public double getArea() { return 0; }
            @Override
            public String getName() { return "Shape"; }
        };
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);
        Square square = new Square(6);

        System.out.println("=== Thông tin từng đối tượng ===");
        System.out.println(shape);
        System.out.println(rectangle);
        System.out.println(circle);
        System.out.println(square);


        System.out.println("\n=== Đa hình (polymorphism) ===");
        List<Shape> shapes = List.of(rectangle, circle, square);
        double total = 0;
        for (Shape s : shapes) {
            System.out.printf("%-10s area = %.2f%n", s.getName(), s.getArea());
            total += s.getArea();
        }
        System.out.printf("Tổng diện tích = %.2f%n", total);
    }
}
