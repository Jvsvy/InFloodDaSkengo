package com.javacource.se.lesson21;

public class Test1 {
    static int b = (int) (Math.random() * 1000000);
    public static void main(String[] args) {
        Thread timer3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 0;
                    while(true){
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                }
                catch (Exception e){
                    System.out.println("cheza hnnya");
                }
            }
        });


        Thread timer4 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    for (int i = 0; i == b;  i= (int) (Math.random() * 1000000) ) {
                        if (i == b){
                            System.out.println("Загадка раскрыта");
                            break;
                        }
                    }
                }catch (Exception e){

                }
            }
        });
        timer4.start();
    }
}
