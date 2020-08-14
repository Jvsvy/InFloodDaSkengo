package com.javacource.se.lesson18;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;

    public void add(String s){
        array[size] = s;
        size++;

        if (size == array.length){
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i< array.length; i++){
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }
    public void remove(int index){
        for (int i = index; i< size - 1;i++){
            array[i] = array[i + 1];
        }
        size--;
    }

    public int getSize() {
        return size;
    }
    public String get(int index){
        return array[index];
    }
}
