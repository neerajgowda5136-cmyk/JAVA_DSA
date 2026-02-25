package com.basics.LoopingStatements;
public class ForLoop {
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++) {
            System.out.println(i + "\t");
        }
        System.out.println();
        for(int i=n;i>=1;i--){
            System.out.println(i+ "\t");
        }
    }
}