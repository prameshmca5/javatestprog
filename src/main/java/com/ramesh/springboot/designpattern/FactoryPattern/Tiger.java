package com.ramesh.springboot.designpattern.FactoryPattern;

public class Tiger implements Animals{
    @Override
    public void speek() {
        System.out.println("Uirr Hummm");
    }

    @Override
    public void preferedAction() {
        System.out.println("Tiger action is Hunting...");
    }
}
