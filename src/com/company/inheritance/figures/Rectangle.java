package com.company.inheritance.figures;

public class Rectangle implements Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        double perimeter = (a + b) * 2;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = a * b;
        return area;
    }
}
