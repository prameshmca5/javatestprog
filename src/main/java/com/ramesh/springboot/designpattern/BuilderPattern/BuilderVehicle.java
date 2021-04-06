package com.ramesh.springboot.designpattern.BuilderPattern;

public interface BuilderVehicle {

    void startUpOperation();
    void buildBody();
    void inserWheels();
    void addHeadlights();
    void endOperations();
    Product getVehicle();
}
