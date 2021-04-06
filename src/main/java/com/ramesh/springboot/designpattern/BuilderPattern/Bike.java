package com.ramesh.springboot.designpattern.BuilderPattern;

public class Bike implements BuilderVehicle{
    private String brandName;
    private Product product;
    public Bike(String brand)
    {
        product = new Product();
        this.brandName = brand;
    }

    @Override
    public void startUpOperation() {
        product.add(String.format("Bike model is :%s",this.brandName));
    }

    @Override
    public void buildBody() {
        product.add("This is a body of a Bike");
    }

    @Override
    public void inserWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("Added 2 Headlights in Front and Back side.");
    }

    @Override
    public void endOperations() {
        product.add("This is Bike endOperations.");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
