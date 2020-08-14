package com.javacource.se.lesson14;

import org.w3c.dom.ls.LSOutput;

public class Student {
    int grade;
    Student(int grade){
        this.grade = grade;

    }

    public static void main(String[] args) {
        Student st = new Student(4);
        switch(st.grade){
            case 2:
                System.out.println("Student has F mark"); break;
            case 3:
                System.out.println("Student has C mark"); break;
            case 4:
                System.out.println("Student has B mark"); break;
            case 5:
                System.out.println("Student have A mark"); break;
            default:
                System.out.println("Switch not work");
        }
    }
}
