package com.javacource.se.lesson8;
import java.lang.Math;

public class HM3 {
    static final double Pi = 3.14;
    public double show(int radius){
       double krug = Pi * (Math.pow(radius,2));
        System.out.println("S krug: " + krug);
    return krug;
    }
    public static double go(int radius){
        double Okruzh = 2 * Pi * radius;
        System.out.println("Dlinna Okruzhnosti: " + Okruzh);
        return Okruzh;
    }




    }
