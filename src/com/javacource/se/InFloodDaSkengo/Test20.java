package com.javacource.se.InFloodDaSkengo;

import com.javacource.se.lesson5.TestStuff;

public class Test20 {
    public int go(int a, int b, int c){
        int result = a+b+c;
        return result;
    }

    public static void main(String[] args) {
        Test20 t =new Test20();
        System.out.println(t.go(5,5,6));
    }
}
