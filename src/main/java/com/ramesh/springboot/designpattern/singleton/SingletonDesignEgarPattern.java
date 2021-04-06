package com.ramesh.springboot.designpattern.singleton;

final class CaptainEgar {

    private static final CaptainEgar captainEgar = new CaptainEgar();

    private void captainEgar() {
        System.out.println("Captain is elected.");
    }
    public static CaptainEgar getCaptainEgar(){
        System.out.println("You have captain in your team to send him for toss");
        return captainEgar;
    }
}

public class SingletonDesignEgarPattern {

    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo***\n");
        System.out.println("Trying to make a captain for your team:");
        //Constructor is private.We cannot use "new" here.
        //Captain c3 = new Captain();//error

        CaptainEgar captain1 = CaptainEgar.getCaptainEgar();
        System.out.println("Trying to make another captain in your Team");
        CaptainEgar captain2 = CaptainEgar.getCaptainEgar();
        if(captain1==captain2){
            System.out.println("Captain1 and Captain2 is same instance. about for already created instances.");
        }
    }
}
