package com.ramesh.springboot.designpattern.AbstractFactory;

public class wildDog implements Dog {
    @Override
    public void speek() {
        System.out.println("This is animal is wildDog Animals Hard speeking...");
    }

    @Override
    public void preferedActions() {
        System.out.println("This is animal is wildDog Animals Hard Parking...");
    }
}
