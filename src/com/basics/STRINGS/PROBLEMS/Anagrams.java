package com.basics.STRINGS.PROBLEMS;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        char[] a=s1.toCharArray();//listen
        char[] b=s2.toCharArray();//silent
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        if(Arrays.equals(a,b)) {
            System.out.println("anagram");
        }else{
            System.out.println("not a anagram");
        }


    }
}
