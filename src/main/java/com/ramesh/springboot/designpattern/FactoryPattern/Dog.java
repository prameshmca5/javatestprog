package com.ramesh.springboot.designpattern.FactoryPattern;

public class Dog implements Animals {

    @Override
    public void speek() {
        System.out.println("Bow-Wow");
    }

    @Override
    public void preferedAction() {
        System.out.println("Dog action is Parking..");
    }
}
