package com.basics.Methods;

import java.util.Scanner;
import java.util.SortedMap;

public class Example2 {//sum of n terms  int n
    static int sumofNTerms(int n){
        return (n * (n+1))/2;
    }
    public static void main(String[] args) {
//        System.out.println("enter the number:");
//        Scanner sc=new Scanner(System.in);
//        int sum=sc.nextInt();
        //first way is to store in variable and then print or directly
        int sum = sumofNTerms(10);
        System.out.println(sum);
        System.out.println(sumofNTerms(100));
    }
}

