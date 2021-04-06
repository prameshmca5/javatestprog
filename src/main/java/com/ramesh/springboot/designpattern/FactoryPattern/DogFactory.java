package com.ramesh.springboot.designpattern.FactoryPattern;

public class DogFactory  extends AnimalsFactory{

    @Override
    public Animals createAnimals() {
        return new Dog();
    }
}
