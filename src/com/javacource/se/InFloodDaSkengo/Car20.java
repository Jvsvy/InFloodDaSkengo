package com.javacource.se.InFloodDaSkengo;

public class Car20 {
    String color;
    String engine;
    int speed;
    int gaz(int skorost){
        speed=skorost+speed;
        return speed;

    }

    int tormoz(int skorost) {
        speed = skorost - speed;
        return speed;
    }

    public void showdatShit(){
        System.out.println(" Cvet " + color +" Motor " + engine + " skorost " + speed);
    }
}
