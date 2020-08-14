package com.javacource.se.lesson17;

import org.w3c.dom.ls.LSOutput;

public class HumanTest {
    public static void main(String[] args) {
        Human h1 = new Human("Dima", 27, 87);
        Human h2 = new Human("Sasha", 24, 90);
        Human h3 = new Human("Arnur", 15, 74);
        Human h4 = new Human("Valya", 34, 76);
        Human h5 = new Human("Olzhik", 14, 60);

        System.out.println("Средний возраст всех 5 людей - ");
        System.out.println((h1.age + h2.age + h3.age + h4.age + h5.age)/5);
    }
}
