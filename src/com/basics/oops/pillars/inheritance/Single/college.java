package com.basics.oops.pillars.inheritance.Single;

public class college {
        static String college="SNPSU";
        int pincode;
        String address;
        public college( int pincode, String address) {
            this.pincode = pincode;
            this.address = address;

        }

    }
    class department extends college {
        String block;
        department(int pincode, String address, String block) {
            super(pincode, address);
            this.block = block;
        }
        void departmentdetails(){
            System.out.println("pincode:"+pincode+" address:"+address+" block:"+block+college);
        }
        public static void main(String[] args) {
            department deparment=new department(573135,"bangalore","a");
            deparment.departmentdetails();
        }
    }
//✅super variable from parent class
//✅super() constructor from parent class
//❌dont use super for constructor