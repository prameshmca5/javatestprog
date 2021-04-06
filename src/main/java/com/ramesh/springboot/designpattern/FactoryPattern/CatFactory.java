package com.ramesh.springboot.designpattern.FactoryPattern;

public class CatFactory extends AnimalsFactory{
    @Override
    public Animals createAnimals() {
        return new Cat();
    }
}
