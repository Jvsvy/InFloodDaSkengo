package com.javacource.se.lesson1;

public class HelloWorld {
    public static void main(String []args){
        System.out.println("Hello World");
        System.out.println("Pidor");
        HelloWorld h = new HelloWorld(122312313,234234224);

    }
    public HelloWorld(long a, long b){
        long s = a+b;
        System.out.println(s);
        
    }
}
