package com.basics.oops.polymorphism.overriding;

public class RBI {
    double rateofInterest(){
        return 6.8;
    }
}
class HDFC extends RBI{
    @Override
    double rateofInterest(){
        return 7.2;
    }

}
class ICICI extends RBI{
    @Override
    double rateofInterest(){
        return 7.5;
    }
}
class CANARA extends RBI {
    @Override
    double rateofInterest() {
        return 7.8;
    }

    public static void main(String[] args) {
        //parent object=new child();---->upcasting
        RBI rbi=new RBI();
        RBI hdfc=new HDFC();
        CANARA canara=new CANARA();
        ICICI icici =new ICICI();
        System.out.println("the rate of interest of rbi is:"+rbi.rateofInterest()+"%");
        System.out.println("the rate of interest of hdfc:"+hdfc.rateofInterest()+"%");
        System.out.println("the rate of interest of icici:"+icici.rateofInterest()+"%");
        System.out.println("the rate of interest of canara:"+canara.rateofInterest()+"%");
    }
}
