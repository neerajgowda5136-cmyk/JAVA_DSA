package com.basics.Methods;

public class Example1 {
    //to access methods without object we use static
    int x =10;//else add static here and remove object declaration and obj.from declared variable
    void add(int a,int b){//method definition
        System.out.println(a+b);
    }
    public static void main(String[] args) {
       Example1 obj =new Example1();//heap memory
       obj.add(1,5);//method call 1,2 arguments
        //the actual values passes during method
        //call are arguments
        Example1 y =new Example1();
       System.out.println(y.x);
    }
}
