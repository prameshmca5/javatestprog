package com.ramesh.springboot.designpattern.AbstractFactory;

public class PetAnimalFactory implements AnimalFactory{
    @Override
    public Dog createDogFactory() {
        return new PetDog();
    }

    @Override
    public Tiger createTigetFactory() {
        return new PetTiger();
    }
}
