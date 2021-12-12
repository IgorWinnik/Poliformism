package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Figure circle = new Circle(1, 5, 5);
        Figure rect = new Rectangle(10, 10, 5, 5);
        System.out.println("Circle");
        System.out.println("Center: " + "(" + circle.x + ", " +circle.y + ")");
        System.out.println("Radius: " + ((Circle) circle).radius);
        System.out.println("Perimetr: " + circle.perimeter());
        System.out.println("Area: " + circle.area());
        //////////////////////////////////////////////////////////////////////////////////////
        System.out.println();
        //////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Rectangle");
        System.out.println("Center: " + "(" + (rect.x + ((Rectangle) rect).weight / 2) + ", " + (rect.y + ((Rectangle) rect).height / 2) + ")");
        System.out.println("Height: " + ((Rectangle) rect).height);
        System.out.println("Weight: " + ((Rectangle) rect).weight);
        System.out.println("Perimetr: " + rect.perimeter());
        System.out.println("Area: " + rect.area());
    }
}
