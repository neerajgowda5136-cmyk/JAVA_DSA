package com.basics.oops.pillars.inheritance;

public interface Demo {
    void display();
}
class Main{
     public static void main(String[] args) {
        //can we create an object of an interface
        Demo obj = new Demo(){
            public void display(){
                System.out.println("Normal code - Boilarplatecode ");
            }
        };
        obj.display();
        //SCALA - java - 8 :  lambda expression ->
        Demo obj1 = () -> System.out.println("Scale code");
        obj.display();

    }
}


