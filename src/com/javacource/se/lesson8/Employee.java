package com.javacource.se.lesson8;

public class Employee {
    Employee(int id2, String s2, int ag2){
        id = id2;
        surname = s2;
        age = ag2;
    }
    Employee(String sur2, int age2){
        surname = sur2;
        age= age2;
    }

    int id;
    String surname;
    int age;
    double salary;
    String departure;
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee em = new Employee(1313 ,"Kotak", 26);


    }
}
