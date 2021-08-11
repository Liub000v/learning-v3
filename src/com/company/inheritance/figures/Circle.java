package com.company.inheritance.figures;


public class Circle implements Figure {
    private double radius;
//    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public double getArea() {
        double s = radius * radius * Math.PI;
        return s;
    }

}
