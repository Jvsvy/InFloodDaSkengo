package com.javacource.se.lesson12;

public class Employee {
    String name;
    double salary;
    Employee(String name, double salary){
        this.name = name;
        this.salary= salary;
    }
    public double uvelichitel(double a){
        a = a * 2;
        return a;
    }

}
