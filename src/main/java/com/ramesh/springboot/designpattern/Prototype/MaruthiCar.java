package com.ramesh.springboot.designpattern.Prototype;

public class MaruthiCar extends BasicCar{
    public int basePrice = 10000;

    public void Maruthi(String str){
        modelName = str;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }
}
