package com.ramesh.springboot.designpattern.FactoryPattern;

public class TigerFactory extends AnimalsFactory {
    @Override
    public Animals createAnimals() {
        return new Tiger();
    }
}
