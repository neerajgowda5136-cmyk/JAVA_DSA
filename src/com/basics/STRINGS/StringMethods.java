package com.basics.STRINGS;

public class StringMethods {
    public static void main(String[] args) {
        String str ="TRIPILLAR solutions";
        System.out.println("length:" + str.length());
        System.out.println("char at index 2:"+ str.charAt(0));
        System.out.println("char at last:"+ str.charAt(str.length()-1));
        System.out.println("UPPERCASE--------->"+ str.toUpperCase());
        System.out.println("LOWECASE---------->"+ str.toLowerCase());
        System.out.println("substring 0-11:"+ str.substring(0,11));
        System.out.println("Equals(TRIPILLAR solutions ):"+ str.equals("TRIPILLAR solutions"));
        System.out.println("equals ignore case TRIPILLAR solutions:"+ str.equalsIgnoreCase("tripillar solutions"));
        String jumbled="NEERAJ from ece b sec";
        String[] words=jumbled.split(" ");
        System.out.println(words[0]);
        String jumbled1="NEERAJ1from1ece1b1sec1sun";
        String[] words1=jumbled.split("1");
        System.out.println(words[3]);
        String name="          NEERAJ B         ";
        System.out.println(name.trim());//removes spaces
        char[] letters={'N','E','E','R','A','J'};//convert array into string NEERAJ
        String word=letters.toString();
        System.out.println(word);//not correct doesnt work
        String word1=new String(letters);//constructor
        System.out.println(word1);
    }
}
