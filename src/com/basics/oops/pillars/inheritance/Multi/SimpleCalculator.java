//package com.basics.oops.pilars.inheritance.Multi;
//
//public class SimpleCalculator {
//    void add(int a ,int b){
//        System.out.println(a+b);
//    }
//    void substract(int a,int b){
//        System.out.println(a-b);
//    }
//}
//class AdvancedCalculator extends SimpleCalculator{
//    void divide(int a ,int b){
//        System.out.println(a/b);
//    }
//    void multiply(int a ,int b){
//        System.out.println(a*b);
//    }
//}
//class SuperAdvancedCalculator extends AdvancedCalculator{
//    void square(int x){
//        System.out.println(Math.pow(x,2));
//    }
//    void cube(int x){
//        System.out.println(Math.pow(x,3));
//    }
//
//    public static void main(String[] args) {
//        System.out.println("======================================================");
//        SimpleCalculator c1=new SimpleCalculator();
//        c1.add(4,2);
//        c1.substract(4,2);
//        System.out.println("======================================================");
//        AdvancedCalculator c2=new AdvancedCalculator();
//        c2.add(4,2);
//        c2.substract(4,2);
//        c2.divide(4,2);
//        c2.multiply(4,2);
//        System.out.println("======================================================");
//        SuperAdvancedCalculator c3=new SuperAdvancedCalculator();
//        c3.add(4,2);
//        c3.substract(4,2);
//        c3.multiply(4,2);
//        c3.divide(4,2);
//        c3.square(4);
//        c3.cube(4);
//
//    }
//}
// Package declaration for organizing classes
package com.basics.oops.pillars.inheritance.Multi;

// Base class: SimpleCalculator
public class SimpleCalculator {
    // Method to add two integers
    void add(int a ,int b){
        System.out.println(a + b);
    }

    // Method to subtract two integers
    void substract(int a, int b){
        System.out.println(a - b);
    }
}

// Derived class: AdvancedCalculator inherits from SimpleCalculator
class AdvancedCalculator extends SimpleCalculator {
    // Method to divide two integers
    void divide(int a ,int b){
        System.out.println(a / b);
    }

    // Method to multiply two integers
    void multiply(int a ,int b){
        System.out.println(a * b);
    }
}

// Further derived class: SuperAdvancedCalculator inherits from AdvancedCalculator
class SuperAdvancedCalculator extends AdvancedCalculator {
    // Method to calculate square of a number
    void square(int x){
        System.out.println(Math.pow(x, 2)); // Math.pow returns double
    }

    // Method to calculate cube of a number
    void cube(int x){
        System.out.println(Math.pow(x, 3)); // Math.pow returns double
    }

    // Main method to test all calculators
    public static void main(String[] args) {
        System.out.println("======================================================");

        // Using SimpleCalculator
        SimpleCalculator c1 = new SimpleCalculator();
        c1.add(4, 2);         // Outputs 6
        c1.substract(4, 2);   // Outputs 2

        System.out.println("======================================================");

        // Using AdvancedCalculator
        AdvancedCalculator c2 = new AdvancedCalculator();
        c2.add(4, 2);         // Inherited from SimpleCalculator
        c2.substract(4, 2);   // Inherited from SimpleCalculator
        c2.divide(4, 2);      // Outputs 2
        c2.multiply(4, 2);    // Outputs 8

        System.out.println("======================================================");

        // Using SuperAdvancedCalculator
        SuperAdvancedCalculator c3 = new SuperAdvancedCalculator();
        c3.add(4, 2);         // Inherited from SimpleCalculator
        c3.substract(4, 2);   // Inherited from SimpleCalculator
        c3.multiply(4, 2);    // Inherited from AdvancedCalculator
        c3.divide(4, 2);      // Inherited from AdvancedCalculator
        c3.square(4);         // Outputs 16.0
        c3.cube(4);           // Outputs 64.0
    }
}