package com.javacource.se.lesson19;

public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect(10,10);
        Triangle triangle = new Triangle(10,10,10);

        System.out.println(rect.area());
        System.out.println(triangle.area());

    }
}
