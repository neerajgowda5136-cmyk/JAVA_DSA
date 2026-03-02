package com.basics.oops.pillars.inheritance.Single;

public class Person {
    String name;
    Person(String name){//constructor - It has a constructor that initializes the name field
        this.name=name;

    }
}
class student extends Person{
    int rollNo;
    student(int rollNo,String name){
        super(name);
        this.rollNo=rollNo;
    }
    void display(){
        System.out.println(rollNo+" "+name);
    }

    public static void main(String[] args) {
        student student=new student(101,"rahul");
        student.display();
    }
}
//