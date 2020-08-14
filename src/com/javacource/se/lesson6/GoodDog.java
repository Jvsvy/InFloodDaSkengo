package com.javacource.se.lesson6;

public class GoodDog {
    private int size;
    public int getSize(){
        return size;
    }
    public void setSize(int s){
        size=s;
    }

    public void bark (){
        if(size > 60) {
            System.out.println("GAV-GAV");
        }
            else if(size > 14){
                System.out.println("vuf-VUF");
            }
            else{
            System.out.println("Tyaf-Tyaf");
        }
        }
        
    }
