package com.basics.Arrays;

import java.util.Arrays;

public class MaxandMin {
    public static void main(String[] args) {
        int[] arr={1,34,0,7,99};
        int mx=arr[0];
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(mx);
        System.out.println(min);


    }
}
