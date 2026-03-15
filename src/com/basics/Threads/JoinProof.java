package com.basics.Threads;

public class JoinProof {
    static class Task extends Thread{
            public void run(){
                try{
                    Thread.sleep(2000);
                }catch (Exception e){}
                System.out.println("This child task or has finished");
            }
        }

        public static void main(String[] args) {
            Task t = new Task();
            t.start();
            System.out.println("Customer has started eating ");

        }
    }

