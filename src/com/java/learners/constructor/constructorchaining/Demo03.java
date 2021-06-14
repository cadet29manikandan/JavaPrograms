package com.java.learners.constructor.constructorchaining;

class Base {
    String name;
    // constructor 1
    Base() {
        this("");
        System.out.println("No-argument constructor of" +
                " base class");
    }
    // constructor 2
    Base(String name) {
        this.name = name;
        System.out.println("Calling parameterized constructor"
                + " of base");
    }
}

public class Demo03 extends Base {
    // constructor 3
    Demo03() {
        System.out.println("No-argument constructor " +
                "of derived");
    }
    // parameterized constructor 4
    Demo03(String name) {
        // invokes base class constructor 2
        super(name);
        System.out.println("Calling parameterized " +
                "constructor of derived");
    }
    public static void main(String[] args) {
        // calls parameterized constructor 4
        Demo03 obj = new Demo03("test");

        // Calls No-argument constructor
        // Demo03 obj = new Demo03();
    }
}