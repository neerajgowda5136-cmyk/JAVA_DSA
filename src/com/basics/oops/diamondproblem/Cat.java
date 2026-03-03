package com.basics.oops.diamondproblem;

public interface Cat {
    default void sound(){
        System.out.println("woof");
    }
}
interface Dog {
    default void sound() {
        System.out.println("bow");
    }
}
class Cog implements Cat,Dog{
    public void sound(){
        System.out.println("some new sound");
        Dog.super.sound();
        Cat.super.sound();
    }
}
class Demo{
    public static void main(String[] args) {
        Cog cog=new Cog();
        cog.sound();
    }
}
