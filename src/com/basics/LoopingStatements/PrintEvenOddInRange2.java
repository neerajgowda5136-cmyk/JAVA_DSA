package com.basics.LoopingStatements;

import java.util.Scanner;

public class PrintEvenOddInRange2 {
    public static void main(String[] args) {
        System.out.println("enter the range:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            if(n %2==0) {
                System.out.println(n + " is EVEN");
            }else{
                System.out.println(n + " is ODD");
            }
        n--;
        }
    }
}
