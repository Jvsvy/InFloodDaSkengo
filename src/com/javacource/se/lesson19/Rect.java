package com.javacource.se.lesson19;

public class Rect extends Figure {
    public double area() {
        System.out.println(" Площадь Прямоугльника:  ");
        return a * b;
    }

    public Rect(int a, double b) {
        super(a, b);
    }
}
