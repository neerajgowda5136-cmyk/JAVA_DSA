package com.basics.LoopingStatements;

import java.util.Scanner;

public class PrintEvenOddInRange {
    public static void main(String[] args) {
        System.out.println("enter the range:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        while(i<=n){
            if(i %2==0) {
                System.out.println(i + " is EVEN");
            }else{
                System.out.println(i + " is ODD");
            }
            i++;
        }
    }
}
