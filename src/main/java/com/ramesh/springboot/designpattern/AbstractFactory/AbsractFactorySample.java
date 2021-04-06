package com.ramesh.springboot.designpattern.AbstractFactory;

public class AbsractFactorySample {

    public static void main(String[] args) {
        //1.Invoke Pet Animals
        AnimalFactory  animalFactory;
        Dog myDog;
        Tiger myTiger;

        // 1. Pet Animals
        System.out.println("** Abstract Factory Method is invoked ... **");
        animalFactory = new PetAnimalFactory();
        myDog = animalFactory.createDogFactory();
        myTiger = animalFactory.createTigetFactory();
        myDog.speek();
        myDog.preferedActions();
        //3.Pet Tiger factory created and display
        myTiger.speek();
        myTiger.referedAction();

        System.out.println("---------------------------------------------------");
        // 2. Wild Animals
        animalFactory = new WildAnimalFactory();
        myTiger = animalFactory.createTigetFactory();
        myDog = animalFactory.createDogFactory();
        myTiger.speek();
        myTiger.referedAction();
        myDog.speek();
        myDog.preferedActions();


    }





}
