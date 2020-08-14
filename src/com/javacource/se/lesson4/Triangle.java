package com.javacource.se.lesson4;

import static java.lang.Math.pow;

public class Triangle {
    double area;
    int height;
    int length;

    public static void main(String[] args) {
        Triangle[] fi = new Triangle[5];
        int x=1;
        while(x<5){
            fi[x] = new Triangle();
            fi[x].area = pow(x,2)+3*x;
            fi[x].height = (x+1)*2;
            fi[x].length = x+4;
            System.out.print("треугольник " + x + ",  зона");
            System.out.println(" = "+ fi[x].area);
            x=x+1;
        }
    }
}
