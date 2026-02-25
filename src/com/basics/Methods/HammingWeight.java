package com.basics.Methods;

public class HammingWeight {
    static  int HammingWeight(int n){
        int count =0;
        while(n!=0){
            if((n & 1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("HW-11:"+HammingWeight(5));
        System.out.println("HW-11:"+HammingWeight(15));
        System.out.println("HW-11:"+HammingWeight(200000));
    }

}
