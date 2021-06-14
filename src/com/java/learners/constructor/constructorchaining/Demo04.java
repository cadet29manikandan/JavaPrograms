package com.java.learners.constructor.constructorchaining;

public class Demo04 {
    // block to be executed before any constructor.
    {
        System.out.println("init block");
    }

    // no-arg constructor
    Demo04() {
        System.out.println("default");
    }

    // constructor with one arguemnt.
    Demo04(int x) {
        System.out.println(x);
    }

    public static void main(String[] args) {
        // Object creation by calling no-argument
        // constructor.
        new Demo04();

        // Object creation by calling parameterized
        // constructor with one parameter.
        new Demo04(10);
    }
}
