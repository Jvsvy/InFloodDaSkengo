package com.javacource.se.lesson8;

public class MethodOverloading {
    void show(int i1){
        System.out.println(i1);
    }

    void show(boolean b1){
        System.out.println(b1);
    }
    void show(String s1){
        System.out.println(s1);
    }
    void show(String bam, int koatk){
        System.out.println("String: " + bam);
        System.out.println("Integer: " + bam);
    }
}

class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        int a = 11;
        mo.show(a);

        boolean b = true;
        mo.show(b);

        String s = "Hello";
        mo.show(s);

        mo.show("Nexus", 6);
    }
}
