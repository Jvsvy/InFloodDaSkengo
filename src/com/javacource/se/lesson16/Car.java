package com.javacource.se.lesson16;

import javax.swing.*;

public class Car {
    String color;
    String engine;

    Car(String color, String engine){
        this.color = color;
        this.engine = engine;
    }
    final static int a = 10;

   public Car abc(String cvet){
       Car c10 = new Car(cvet, "v4");
       return c10;
   }

    public static void main(String[] args) {
        Car c =new Car("red", "V6");
                c.abc("green");
        System.out.println(c.color);
    }
}
