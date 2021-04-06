package com.ramesh.springboot.designpattern.AbstractFactory;

public class PetDog implements Dog {
    @Override
    public void speek() {
        System.out.println("This is animal is PetDog Animals Soft speeking...");
    }

    @Override
    public void preferedActions() {
        System.out.println("This is animal is PetDog Animals Soft Parking...");
    }
}
