package com.ramesh.springboot.designpattern.AbstractFactory;

public class WildAnimalFactory implements AnimalFactory{
    @Override
    public Dog createDogFactory() {
        return new wildDog();
    }

    @Override
    public Tiger createTigetFactory() {
        return new WildTiger();
    }
}
