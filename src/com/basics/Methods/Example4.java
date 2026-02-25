package com.basics.Methods;

public class Example4 {
    static int maxPieces(int n){
        return((n*(n+1))/2)+1;
    }

    static int maxRegions(int n){
        return((n*(n+1))/2)+1;
    }

    public static void main(String[] args) {
        System.out.println("max Pieces:"+ maxPieces(15));
        System.out.println("max Regions:"+ maxRegions(25));
    }
}

