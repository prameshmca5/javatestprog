package com.ramesh.springboot.designpattern.BuilderPattern;

public class Director {
    BuilderVehicle builder;
    public void construct(BuilderVehicle builder){
        this.builder = builder;
        builder.startUpOperation();
        builder.buildBody();
        builder.inserWheels();
        builder.addHeadlights();
        builder.endOperations();
    }
}
