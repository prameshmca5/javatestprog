package com.ramesh.springboot.designpattern.Prototype;

public class PrototypeDesignPattern {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("***Prototype Pattern Demo***\n");
        BasicCar nano = new NanoCar();
        nano.setModelName("Nano Car");
        nano.basePrice=100000;

        BasicCar maruthi = new MaruthiCar();
        maruthi.setModelName("Maruthi Car");
        maruthi.basePrice=50000;

        BasicCar bc1;
        bc1 =nano.clone();
        System.out.println(nano.getModelName());
        bc1.onRoadPrice = nano.basePrice+BasicCar.setAdditionalPrice();
        System.out.println("Car is: "+ bc1.modelName+" and it's price is Rs."+bc1.onRoadPrice);


        BasicCar bc2;
        bc2 = maruthi.clone();
        System.out.println(maruthi.getModelName());
        bc2.onRoadPrice = maruthi.basePrice+BasicCar.setAdditionalPrice();
        System.out.println("Car is: "+ bc2.modelName+" and it's price is Rs."+bc2.onRoadPrice);
    }

}
