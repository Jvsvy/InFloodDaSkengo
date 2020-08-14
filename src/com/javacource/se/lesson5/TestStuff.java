package com.javacource.se.lesson5;

import org.w3c.dom.ls.LSOutput;

public class TestStuff {
    public void go(){
        TestStuff t = new TestStuff();
        t.takeTwo(12, 34);

    }
   public void takeTwo(int x, int y){
        int z= x + y;
        System.out.println("Сумма ровна"+ z);
    }
    
}
