
package com.advanced.collections.Map;

import java.util.ArrayList;

    public class RemoveUsingLambdaExpression {
        public static void main(String[] args) {
            ArrayList<Integer>numbers=new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(15);
            numbers.add(16);
            System.out.println("Before"+numbers);
            numbers.removeIf(x-> x>10);
            System.out.println("After"+numbers);
        }
    }

