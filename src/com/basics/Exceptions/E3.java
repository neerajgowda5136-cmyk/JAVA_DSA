package com.basics.Exceptions;

public class E3 {
    static void checkAge(int age){
        if (age>=18){
            System.out.println("access granted eligible.");
        }else{
            throw new RuntimeException("access denied ");
        } System.out.println("user start app");
    }

    public static void main(String[] args) {
        checkAge(28);
    }
}
