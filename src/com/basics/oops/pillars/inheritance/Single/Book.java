package com.basics.oops.pillars.inheritance.Single;

public class Book {
        String name;
        int id;
        int price;
        public Book(String name, int id, int price) {
            this.name = name;
            this.id = id;
            this.price = price;
        }
    }
    class library extends Book {
        public library(String name, int id, int price) {
            super(name, id, price);

        }
        void details(){
            System.out.println("Book Details:"+name+" "+id+" "+price);
        }
        public static void main(String[] args) {
            library library = new library("Book 1",10,100000);
            library.details();
        }
    }

