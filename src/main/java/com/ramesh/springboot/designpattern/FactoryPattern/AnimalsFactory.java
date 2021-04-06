package com.ramesh.springboot.designpattern.FactoryPattern;

abstract class AnimalsFactory {
    public abstract Animals createAnimals();

    public Animals makeAnimals() {
        System.out.println("Am inside in making Animal Factory methods ignore the roue to create.");
        Animals animals = createAnimals();
        animals.speek();
        animals.preferedAction();
        return animals;
    }
}
