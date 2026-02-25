package com.basics.patterns;

public class ReverseHeartPattern {
    public static void main(String[] args) {
        for(int r=0;r<6;r++){
            for(int c=0;c<7;c++){
                if( r+c==3||c-r==3 ||r==4 && c%3==0 || r==5 && c%3!=0){
                    System.out.print(" x ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        for(int r=0;r<6;r++){
            for(int c=0;c<7;c++){
                if(r==0&&c%3!=0||r==1&& c%3==0 || r-c==2 ||r+c==8){
                    System.out.print(" x ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
