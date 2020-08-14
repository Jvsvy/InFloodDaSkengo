package com.javacource.se.lesson18;

import java.util.ArrayList;

public class Collection2 {
    public static void main(String[] args) {
 int size = 0;
        int[] num = new int[10 + 1];
        ArrayList<String> name = new ArrayList<>();

        name.add("Veronika ");
        name.add("Nikita ");
        name.add("Vanya ");
        name.add("Katya ");
        name.add("Batya ");
        name.add("Nyusha ");
        name.add("Bauka ");
        name.add("Nursik ");
        name.add("Kristina ");
        name.add("Khasso ");



        for (int i = 0, j = 0; i<num.length; i++){
            System.out.println(i);
            for (String na : name){
                System.out.print(na);

            }

            if (i == 10){
                break;
            }
        }
    }


}
