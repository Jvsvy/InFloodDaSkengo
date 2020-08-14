package com.javacource.se.lesson19;

public class Triangle extends Figure{
    private double c;

    @Override
    public double area() {
        double p = (a + b + c)/2;

        System.out.println(" Площадь Треугольника: ");
        return Math.sqrt(p *(p-a)*(p-b)*(p-c));
    }

    public Triangle(int a, double b, double c) {
        super(a, b);
        this.c = c;
    }
}
