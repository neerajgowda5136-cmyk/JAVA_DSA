package com.basics.conditionalstatements;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        //Number->NESTING -condition inside condition
        /*
        Even->Whether it is divisble by 4 or not
        Odd->Whether it is divisble by 3 or not
         */
        //OBJECT creation -> Classname Obj =new Classname();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            if (n % 4 == 0) {
                System.out.println(n + "is div by 4");
            } else {
                System.out.println(n + "is not div by 4");
            }


        } else {
            if (n % 3 == 0) {
                System.out.println(n + "is div by 3");
            } else {
                System.out.println(n + "is not div by 3");
            }
        }
    }
}
