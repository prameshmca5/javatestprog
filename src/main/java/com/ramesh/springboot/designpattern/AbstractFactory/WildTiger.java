package com.ramesh.springboot.designpattern.AbstractFactory;

public class WildTiger implements Tiger {
    @Override
    public void speek() {
        System.out.println("This is animal is WildTiger Animals Hard speeking...");
    }

    @Override
    public void referedAction() {
        System.out.println("This is animal is WildTiger Animals Hard Hunding..");
    }
 }
