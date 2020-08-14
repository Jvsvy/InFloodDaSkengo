package com.javacource.se.lesson18;

public class CollTest {
    public static void main(String[] args) {
       MyArrayList employees = new MyArrayList();
       employees.add("Nikita");
        employees.add("Nikita");
        employees.add("Nikita");
        employees.add("Nikita");
        employees.add("Nikita");

        for ( int i = 0; i< employees.getSize(); i++){
            System.out.println(employees.get(i));
        }
    }
}
