//package com.basics.oops.pillars.Abstraction.AbstractionInterfaces;
//
//public interface Animal {
//    //interface have methods with completely empty bodies
//    //so they exhibit 100% abstraction
//    //the methods are defined in the child class
//    void run();
//    void loves_to_eat();
//}
//class Rat implements Animal{
//    @Override
//    public void run(){
//
//    }
//    @Override
//    public void loves_to_eat(){
//        System.out.println("rats love to eat cheese");
//    }
//
//}
//class Cat implements Animal{
//    @Override
//    public void run(){
//
//    }
//    @Override
//    public void loves_to_eat(){
//        System.out.println("cats love to eat rats");
//    }
//
//}
//class Dog implements Animal{
//    @Override
//    public void run(){
//
//    }
//    @Override
//    public void loves_to_eat(){
//        System.out.println("dogs love to eat biscuits");
//    }
//
//}
//class Interfacedemo{
//    public static void main(String[] args) {
//        Rat rat=new Rat();
//        Cat cat=new Cat();
//        Dog dog= new Dog();
//        cat.run();
//        cat.loves_to_eat();
//        rat.run();
//        rat.loves_to_eat();
//        dog.run();
//        dog.loves_to_eat();
//
//    }
//}
package com.basics.oops.pillars.Abstraction.AbstractionInterfaces;

public interface Animal {
    //interface have methods with completely empty bodies
    //so they exhibit 100% abstraction
    //the methods are defined in the child class

    void loves_to_eat();
}
class Rat implements Animal{

    @Override
    public void loves_to_eat(){
        System.out.println("rats love to eat cheese");
    }

}
class Cat implements Animal{

    @Override
    public void loves_to_eat(){
        System.out.println("cats love to eat rats");
    }

}
class Dog implements Animal{

    @Override
    public void loves_to_eat(){
        System.out.println("dogs love to eat biscuits");
    }

}
class Interfacedemo{
    public static void main(String[] args) {
        Rat rat=new Rat();
        Cat cat=new Cat();
        Dog dog= new Dog();
        cat.loves_to_eat();
        rat.loves_to_eat();
        dog.loves_to_eat();

    }
}


