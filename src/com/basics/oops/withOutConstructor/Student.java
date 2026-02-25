package com.basics.oops.withOutConstructor;

public class Student {
    //instance variables
    int USN;
    String name;
    int marks;
    void evaluationmarks(){
        if(marks<45){
            System.out.println(name+" :usn -"+ USN+" has failed");
        }else{
            System.out.println(name+" :usn-" +USN+" has passed");
        }
    }

    public static void main(String[] args) {
        //object creation syntax :Classmate obj=new Classmate();
        Student s1=new Student();
        s1.USN=101;
        s1.name="virat";
        s1.marks=42;
        Student s2=new Student();
        s2.USN=102;
        s2.name="rohit";
        s2.marks=68;
        s1.evaluationmarks();
        s2.evaluationmarks();
    }
}
