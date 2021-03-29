package com.ramesh.springboot.sprcloud;

import java.io.FileNotFoundException;

public class testJavaproj {

    public static void main(String[] args) {

        Parent pd = new Parent();
        Child cld = new Child();
        cld.voidmethod();
        pd.voidmethod();
       // pd.parentprivate();
    }



}

class Parent {
    public static void voidmethod() {
        System.out.println("Welcome to Parent static methods");
    }

    private void parentprivate() {
        System.out.println("This is Parent private Methods");
    }
}

class Child extends Parent {
    public static void voidmethod(){
        System.out.println("Welcome to Child Static Methods");
    }

    private void parentprivate() {
        System.out.println("Welcome to Child private Methods");
    }
}
