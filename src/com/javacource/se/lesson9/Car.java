package com.javacource.se.lesson9;

public class Car {
    int aasdd = 5;
    String Kotak = "w";
    static String color;
    String engine;
    static int count;
    public Car(String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
    }

    public void showcolor(){
        System.out.println("color of Car" + color);
    }

//    public void changeColor(String color3){
//        System.out.println("Color is changed");
//        int cena = 5000;
//        color = color3;
//        cena = cena +1000;
//    }

    void changeColor(String color){
       this.color = color;
    }
int kotakpas= 667;
    public static void main(String[] args) {
        Car c = new Car("red", "V8");
        System.out.println(c.color);
        c.changeColor("black");
    }
}