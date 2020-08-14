package com.javacource.se.lesson12;

import java.util.ArrayList;

public class Car {
    static String color;
    static String engine;
    static int door;
     Car(String color, int door, String engine){
         this.color = color;
         this.door = door;
         this.engine = engine;

     }


    public int Doorkot(int b){
        this.door = b;
        return b;
    }
    public void Bmw(String color1, String color2){
        String sex = color1;
        color1 = color2;
        sex = color2;
    }
}
