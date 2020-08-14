package com.javacource.se.lesson21;

public class Main {
    public static void main(String[] args) {
        Thread timer = new Thread(new Runnable() {
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

                    }

            }
        });
        timer.start();


    }
}
