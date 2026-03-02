//package com.basics.oops.withConstructor;
//
//public class Student {
//    //instance variables
//    int USN;
//    String name;
//    int marks;
//    static String college="snpsu"
//    Student(int USN,String name,int marks){
//        this.USN=USN;
//        this.name=name;
//        this.marks=marks;
//
//
//    }
//    void evaluationmarks(){
//        if(marks<45){
//            System.out.println(name+" :usn -"+ USN+" has failed");
//        }else{
//            System.out.println(name+" :usn-" +USN+" has passed");
//        }
//        void studentDetails(){
//            System.out.println(name+""+college);
//        }
//    }
//
//    public static void main(String[] args) {
//        //object creation syntax :Classmate obj=new Classmate();
//        Student s1=new Student(101,"virat",42);
//
//        Student s2=new Student(102,"rohit",67);
//
//        s1.evaluationmarks();
//        s2.evaluationmarks();
//        s1.studentDetails();
//    }
//}
