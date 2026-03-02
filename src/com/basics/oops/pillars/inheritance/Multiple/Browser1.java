package com.basics.oops.pillars.inheritance.Multiple;

public interface Browser1 {
    void Browser1();
}
interface Browser2{
    void Browser2();
}
interface Browser3{
    void Browser3();
}
class Browsers implements Browser1,Browser2,Browser3{
    @Override
    public void Browser1(){
        System.out.println("chrome");
    }
    @Override
    public void Browser2(){
        System.out.println("firefox");
    }
    @Override
    public void Browser3(){
        System.out.println("brave");
    }

    public static void main(String[] args) {
        Browsers browser=new Browsers();
        browser.Browser1();
        browser.Browser2();
        browser.Browser3();
    }


}
