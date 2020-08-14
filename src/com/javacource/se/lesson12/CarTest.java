package com.javacource.se.lesson12;

import javax.swing.*;
import java.util.ArrayList;

public class CarTest {

    public static void main(String[] args) {
       Car c = new Car(null, 0, null);
        Car c1 = new Car("black", 4, "V8");
        Car c2 = new Car("white", 2, "V12");
        System.out.println("Информация о 1 машине - Двери:" + c.Doorkot(4) + " Мотор: " + c1.engine + " Окрас: " + c1.color );
        System.out.println("Информация о 2 машине - Двери:" + c.Doorkot(2) + " Мотор: " + c2.engine + " Окрас: " + c2.color );
    }
}
