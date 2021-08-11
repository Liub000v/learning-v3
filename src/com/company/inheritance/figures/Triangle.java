package com.company.inheritance.figures;


public class Triangle implements Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        double perimeter = a + b + c;
        return perimeter;
    }

    @Override
    public double getArea() {
        double perimeter = getPerimeter();
        double area = Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
        return area;
    }
}
