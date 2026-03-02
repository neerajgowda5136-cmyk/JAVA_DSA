package com.basics.oops.pillars.inheritance.Single;

//public class Animal {
//    void Eat() {
//        System.out.println("Animal eats some food");
//    }
//}
//class cat {
//    void run(){
//        System.out.println("cats run very fast");
//    }
//    public static void main(String[] args) {
//        cat cat = new cat();
//        cat.run();
//    }
//
//}
public class Animal {
    void Eat() {
        System.out.println("Animal eats some food");
    }
}
class Cat  extends Animal{//child class - Class Definition: Your class cat extends Animal, meaning it inherits properties and methods from the Animal class.

    void run(){
        System.out.println("cats run very fast");//- This invokes the run() method defined in the cat class. From the output shown in the terminal, we can infer that this method prints:

    }
    public static void main(String[] args) {
        Cat cat = new Cat();//- This invokes the run() method defined in the cat class. From the output shown in the terminal, we can infer that this method prints:
        cat.run();
        cat.Eat();
    }
}
