package com.basics.oops.pillars.inheritance.Single;

public class Employee {
    int id;
    String name;
    public Employee(String name,int id){
        this.name=name;
        this.id=id;

    }
}
class Lecturer extends Employee{
    String subject;

    public Lecturer(String name,int id,String subject) {
        super(name,id);
        this.subject=subject;
    }
    void details(){
        System.out.println("lecturer"+name+" "+id+" "+subject);
    }
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer("Rajeev", 108, "SMS");
        lecturer.details();
    }
}