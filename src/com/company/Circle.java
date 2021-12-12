package com.company;

public class Circle extends Figure implements Moveable {
    double radius;

    public Circle(double radius, double x, double y) {
        super(x, y);
        this.radius = radius;
    }



    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void move(double value) {
        this.x += value;
        this.y += value;
    }

    @Override
    public void changeSize(double number) {
        this.radius *= number;
    }
}
