package com.basics.oops.polymorphism.overriding;

public class User {
    void role(){
        System.out.println("Admin user");
    }
}
class Admin extends User{
    @Override
    void role(){
        System.out.println("Admin user");
    }
}
class Guest extends User{
    @Override
    void role(){
        System.out.println("Guest user");
    }
}
class Demo{
    public static void main(String[] args) {
        User user=new User();
        user.role();
    //upcasting
        User user1=new Admin();
        user1.role();
        User user2=new Guest();
        user2.role();
        // the reference doesnt matters the object matters
    }
}
