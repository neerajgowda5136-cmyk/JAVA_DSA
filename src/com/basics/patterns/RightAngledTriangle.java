package com.basics.patterns;

public class RightAngledTriangle {

    static void rightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( " *");
            }
            System.out.println();
        }
    }

    static void rightTriangleNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rightTriangle(6);
        rightTriangleNumbers(5);
    }
}