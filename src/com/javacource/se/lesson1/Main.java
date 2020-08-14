package com.javacource.se.lesson1;

import com.javacource.se.lesson6.GoodDog;

public class Main {
    public static void main(String[] args){
        GoodDog one = new GoodDog();
        one.setSize(79);
        GoodDog two = new GoodDog();
        two.setSize(12);
        System.out.println("Первая собака:" + one.getSize());
        System.out.println("Второя собака:" + two.getSize());
    one.bark();
    two.bark();
    }
}


