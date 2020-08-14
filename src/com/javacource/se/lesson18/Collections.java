package com.javacource.se.lesson18;

import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i =0; i < 1000; i++){
            numbers.add(i);
        }
        int sum = 0;
        for (int i : numbers){
            System.out.println(i);
            sum = sum +i;
        }
        System.out.println(sum);
    }

}
