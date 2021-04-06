package com.ramesh.springboot.designpattern.BuilderPattern;

public class Car implements BuilderVehicle{

    private String brandName;
    private Product product;
    public Car(String brand)
    {
        product = new Product();
        this.brandName = brand;
    }

    @Override
    public void startUpOperation() {
        product.add(String.format("Car model is :%s",this.brandName));
    }

    @Override
    public void buildBody() {
        product.add("This is a body of a Car");
    }

    @Override
    public void inserWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("Added headlights in Car 4 sides");
    }

    @Override
    public void endOperations() {
        product.add("This is car Class endOperations.");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
