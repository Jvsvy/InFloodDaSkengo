package com.javacource.se.lesson8;

public class Test1 {
    public int sum(int a, int b, int c){
        return a+b+c;
    }
    int sredArifm(int x, int z, int y){
        return sum(x, z, y)/3;

    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(t.sum(1,2,3));
        t.sredArifm(2,4,5);
        System.out.println( t.sredArifm(2,4,5));
    }
}
