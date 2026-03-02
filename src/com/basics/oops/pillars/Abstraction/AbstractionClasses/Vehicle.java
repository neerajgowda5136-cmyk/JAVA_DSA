package com.basics.oops.pillars.Abstraction.AbstractionClasses;

public abstract class Vehicle {
        //two types of methods
        //normal or concrete
        void vehicle_type(){
            System.out.println("two or four wheeler");
        }
        abstract void start();
        //this abstract method will be defined in the child class
        //if there are only abstract methods-100% ABSTRACTION
        //if there are 1 normal method-not 100% abstraction
    }
    class Meteor350 extends Vehicle {
        @Override
        void start() {
            System.out.println("meteor 350 starts with a self");
        }
    }
    class TexaHexa extends Vehicle {
        @Override
        void start() {
            System.out.println("Hexa starts with a key");
        }
    }
    class Demo{
        public static void main(String[] args) {
            Meteor350 bike=new Meteor350();
            TexaHexa car=new TexaHexa();
            bike.start();
            bike.vehicle_type();
            car.start();
            car.vehicle_type();
        }
    }


