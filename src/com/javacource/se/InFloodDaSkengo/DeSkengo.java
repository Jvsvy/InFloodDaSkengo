package com.javacource.se.InFloodDaSkengo;
import java.util.*;
import java.math.*;

public class DeSkengo {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        int result ;
        for (int i=0; i<11;){

            System.out.printf("%d * %d = %d%n", N, i, N*i);
//            Printf используется для форматирования вывода по мере необходимости;
//            % d для int, аналогично у нас есть% s для String и% f для float и так далее.
//            Также у нас есть% n для новой строки, которая предназначена для println для printf.
//            Здесь первый% d сопоставляется с первым значением после ',', если выброшено исключение совпадения формата. % d -> N% d -> i% d -> N * i
            i++;
        }
        }


    }

