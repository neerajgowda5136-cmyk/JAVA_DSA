package com.basics.patterns;

public class ZigZag {
    public static void main(String[] args) {
        int n=100;
        for(int r=1;r<=3;r++){
            for(int c=1;c<n;c++){
                if((r+c)%4==0||r==2&&c%4==0){
                    System.out.print(" x ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
