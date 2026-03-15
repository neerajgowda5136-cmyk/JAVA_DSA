package com.advanced.collections.List;


import java.util.ArrayList;
import java.util.List;

    public class ShoppingCart {
        public static void main(String[] args) {
            List<String> cart=new ArrayList<>();
            cart.add("mouse");
            cart.add("keyboard");
            cart.add("pc");
            cart.remove("mouse");
            System.out.println(cart);
            //to update anything to the exixsting one
            cart.set(1,"mechanical keyboard");
            System.out.println(cart);
        }
    }

