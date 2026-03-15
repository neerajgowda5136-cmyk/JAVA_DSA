package com.basics.Threads;

public class ResultDeclaration {
    void declarationResult()throws Exception{
        System.out.println("Admin waiting for approval...");
        wait();
        System.out.println("Exam Result Declared...!");
    }
    synchronized void approve(){
        notify();
    }
    public static void main(String[] args)throws Exception{
        ResultDeclaration rd = new ResultDeclaration();
        new Thread(()  -> {
            try{
                rd.declarationResult();
            }catch (Exception e){}
        }).start();
        Thread.sleep(2000);
        new Thread(() -> rd.approve()).start();

    }
}
