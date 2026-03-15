package com.advanced.DSA.ALGO.Sorting;
import java.util.Arrays;

    public class InsertionSort {
        public static void InsertionSort(int[] arr){
            for(int i=1;i<arr.length;i++){
                int temp=arr[i];
                int j=i-1;
                while(j>=0 && arr[j]>temp){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=temp;

            }
        }
        public static void main(String[] args){
            int[] arr={3,2,5,1,4,6,9,8};
            System.out.println(Arrays.toString(arr));
            InsertionSort(arr);
            System.out.println(Arrays.toString(arr));
        }

    }