package com.company;

public class Rectangle extends Figure implements Moveable {
    double height;
    double weight;

    public Rectangle(double weight, double height, double x, double y) {
        super(x, y);
        this.weight = weight;
        this.height = height;
    }

    @Override
    double area() {
        return height * weight;
    }

    @Override
    double perimeter() {
        return 2 * (height + weight);
    }

    @Override
    public void move(double value) {
        this.x += value;
        this.y += value;
    }

    @Override
    public void changeSize(double number) {
        this.height *= number;
        this.weight *= number;
    }
}
