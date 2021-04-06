package com.ramesh.springboot.designpattern.FactoryPattern;

public class FactoryMethodExample {
    public static void main(String[] args) {
        System.out.println("*** Created in Animal Factory ***");

        long starttime = System.nanoTime();
        AnimalsFactory animalsFactory = new DogFactory();
        Animals animals = animalsFactory.createAnimals();
        animals.speek();
        animals.preferedAction();

        // Get Tiger Factory
        AnimalsFactory animalsFactory1 = new TigerFactory();
        Animals animals1 = animalsFactory1.createAnimals();
        animals1.speek();
        animals1.preferedAction();


        // Get Cat factory
        AnimalsFactory catAnimals = new CatFactory();
        Animals cat = catAnimals.createAnimals();
        cat.speek();
        cat.preferedAction();


        long endTime = System.nanoTime();
        long gettimeels = endTime-starttime;
        System.out.println("Execution time in nanoseconds: " + gettimeels);
        System.out.println("Execution time in milliseconds: " + gettimeels / 1000000);


        // Code Simply
        System.out.println("---------------------------------------------------");
        long starttime1 = System.nanoTime();
        AnimalsFactory amfact = new TigerFactory();
        amfact.makeAnimals();

        AnimalsFactory amlcat = new CatFactory();
        amlcat.makeAnimals();

        AnimalsFactory dogfact = new DogFactory();
        dogfact.makeAnimals();

        long endTime1 = System.nanoTime();
        long gettimeels1 = endTime1-starttime1;
        System.out.println("Execution time in nanoseconds: " + gettimeels1);
        System.out.println("Execution time in milliseconds: " + gettimeels1 / 1000000);
    }
}
