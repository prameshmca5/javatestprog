package com.ramesh.springboot.designpattern.BuilderPattern;

public class BuilderPatternExample {

    public static void main(String[] args) {
        System.out.println("*** Builder Pattern Started ***");
        // Create Director class
        Director director = new Director();

        // Create Builder Vechle
        BuilderVehicle builderBike = new Bike("Pulsar 150CC");
        BuilderVehicle builderCar = new Car("Honda CRV");

        // Making a Car
        director.construct(builderCar);
        Product p1 = builderCar.getVehicle();
        p1.showProduct();


        // Making a Bike
        director.construct(builderBike);
        Product p2 = builderBike.getVehicle();
        p2.showProduct();
    }
}
