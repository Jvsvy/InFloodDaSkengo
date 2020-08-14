package com.javacource.se.lesson20;

public class Exceptions {
    public static void main(String[] args) {
        int[] num = new int[10];
        try {
            num[11] = 12;

        }catch(IndexOutOfBoundsException e) {
                    System.out.println("Выход за пределы массива");
        }

        System.out.println("Khorosh");
    }
}
