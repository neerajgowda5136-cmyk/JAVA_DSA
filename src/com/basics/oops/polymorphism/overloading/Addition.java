package com.basics.oops.polymorphism.overloading;

public class Addition {
    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(int a, int b,int c){
        System.out.println(a+b);
    }
    static void add(float a, float b){
        System.out.println(a+b);
    }
    static void add(double a, double b){
        System.out.println(a+b);//happens in same class so change number of  parameters or changing parameters
    }

    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
        add(1.2454,2.32432423123);
        add(1.2,1.5);
    }

}
