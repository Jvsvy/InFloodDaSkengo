package com.javacource.se.InFloodDaSkengo;

import java.util.Scanner;


//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int x=sc.nextInt();
//        double y = sc.nextDouble();
//        sc.nextLine();
//        String s = sc.nextLine();
//
//    System.out.println("String: "+s);
//    System.out.println("Double: "+y);
//    System.out.println("Int: "+x);


//public static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    System.out.println("================================");
//    for(int i=0;i<4;i++)
//    {
//        String s1=sc.nextLine();
//        int x=sc.nextInt();
//        String s2=sc.nextLine();
//        int b = sc.nextInt();
//        String s3 = sc.nextLine();
//        int c = sc.nextInt();
//    }
//    System.out.println("================================");
//
//}
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        String ans;
        if(n%2==1 || (n>=6 && n <= 20)){
            ans = "Weird";
        }else{
            ans = "Not Weird";
        }
        System.out.println(ans);
    }
}






