package com.javacource.se.lesson8;

public class MethodOverloading2 {
    public int sum (int i1, int i2){
        return i1 + i2;

    }
    protected String sum(String s1 , String s2){
        return s1+s2;

    }

}

class MethodOverloading2Test{
    public static void main(String[] args) {
        MethodOverloading2 mo2 = new MethodOverloading2();
        int a = mo2.sum(5,7);
        System.out.println(a);
        String s = mo2.sum("privet", "asdasd");
        System.out.println(s);
    }
}
