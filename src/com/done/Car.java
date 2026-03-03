package com.done;
    public class Car {

        // --- THE BLUEPRINT (Attributes & Methods) ---
        String color;
        String brand;

        public void drive() {
            System.out.println("The " + color + " " + brand + " is driving!");
        }

        // --- THE FACTORY FLOOR (Where we build the objects) ---
        public static void main(String[] args) {

            // 1. Build the first car (Object 1)
            Car myFirstCar = new Car();
            myFirstCar.color = "Red";
            myFirstCar.brand = "Toyota";

            // 2. Build the second car (Object 2)
            Car mySecondCar = new Car();
            mySecondCar.color = "Blue";
            mySecondCar.brand = "Ford";

            // 3. Use the objects! (Call their methods)
            myFirstCar.drive();
            mySecondCar.drive();
        }
    }
