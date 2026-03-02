package com.basics.oops.pillars.inheritance.Hybrid;

interface Sports{
    void play();
}
class Person{
    String name;
    Person(String name){
        this.name = name;

    }
}
public class Student extends Person implements Sports{
    Student(String name){
        super(name);// here we call the parent class constructer
    }
    @Override
    public void play(){
        System.out.println(name + " plays football.");
    }
    public static void main(String[] args){
        Student student = new Student("sam");
        student.play();
    }
}