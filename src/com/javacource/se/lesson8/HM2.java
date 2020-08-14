package com.javacource.se.lesson8;

public class HM2 {
    HM2(){}

    HM2(int id2, String surname2,String name2 ){
        this(id2,surname2, name2, 0, 0.0, null );

    }
    HM2(int id3, String surname3,String name3,int age3, double salary3, String department3){

        id3 = id;
        surname3 = surname;
        age = age3;
        salary = salary3;
        department3 = department;
        name = name3;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
    String name;



    public class HM2Test{


            HM2 hm2 = new HM2(122, "Petrov", "Gang", 19, 24000, "Hz");
            HM2 hm3 = new HM2(123, "Sidorov", "Van'ka");
            HM2 hm4 = new HM2();

    }

}

