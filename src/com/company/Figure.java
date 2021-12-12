package com.company;

public abstract class Figure {
    double x;
    double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    abstract double area();
    abstract double perimeter();
}
