package com.ramesh.springboot.designpattern.AbstractFactory;

public class PetTiger implements Tiger {
    @Override
    public void speek() {
        System.out.println("This is animal is PetTiger Animals Soft speeking...");
    }

    @Override
    public void referedAction() {
        System.out.println("This is animal is PetTiger Animals Soft Hunding..");
    }
 }
