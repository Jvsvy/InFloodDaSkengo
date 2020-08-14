package com.javacource.OOP.Nasledovaniye;

public class Sub_class extends Super_class {
    int num = 77;

    public void display (){
        System.out.println("Этот метод Дисплей субкласса");
    }
    public void MyMethod(){
        Sub_class sub = new Sub_class();
        sub.display();
        //вызываем метод из Суб класса
        super.display();
//вызываем метод Супер класса
        System.out.println(sub.num);
        System.out.println(super.num);
    }

    public static void main(String[] args) {
        Sub_class obj = new Sub_class();
        obj.MyMethod();
    }
}
