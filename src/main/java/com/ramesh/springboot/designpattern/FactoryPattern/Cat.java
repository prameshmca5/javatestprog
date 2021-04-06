package com.ramesh.springboot.designpattern.FactoryPattern;

public class Cat  implements Animals{
    @Override
    public void speek() {
        System.out.println("Meyoveee meyavee...");
    }

    @Override
    public void preferedAction() {
        System.out.println("The Meyoave is doing sounds....");
    }
}
