package com.javacource.se.lesson15;

import javax.imageio.stream.ImageInputStream;

public class Test4 {
    public void time() {

        for (int chas = 0; chas < 24; chas++) {

            for (int minuta = 0; minuta <= 59; minuta++) {


                for (int secunda = 0; secunda <= 59; secunda++) {

                    System.out.println(chas + " : " + minuta + " : " + secunda);
                }
            }

        }
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        t.time();
    }
}
