package com.javacource.se.lesson9;

import com.javacource.se.lesson5.TestStuff;

public class Test1 {
    int a = 2;
    static int b = 2;
    void abc(int a){
        System.out.println(a);
        System.out.println(this.a);

    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.abc(3);
    }
}
