package com.ramesh.springboot.designpattern.singleton;

// LAZY INSTIALIZATION SINGLETON DESIGN PATTEREN

final class Captain {

    private static Captain captain;

    private Captain() { }

    public static synchronized Captain getCaptain() {
        if(captain==null) {
            Captain captain = new Captain();
            System.out.println("New Captain in elected.");
        }else {
            System.out.println("You have already captain is there..");
            System.out.println("Send him for the toss");
        }
        return captain;
    }
}

public class SingltonDesignPattern {
    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for your team:");
        //Constructor is private.We cannot use "new" here.
        //Captain c3 = new Captain();//error

        Captain captain1 = Captain.getCaptain();
        System.out.println("Trying to make another captain in your Team");
        Captain captain2 = Captain.getCaptain();
        if(captain1==captain2){
            System.out.println("Captain1 and Captain2 is same instance. about for already created instances.");
        }
    }
}

