package com.java.learners.constructor.constructorchaining;

public class Demo01 {
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    Demo01() {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }

    // parameterized constructor 2
    Demo01(int x) {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }

    // parameterized constructor 3
    Demo01(int x, int y) {
        System.out.println(x * y);
    }

    public static void main(String[] args) {
        // invokes default constructor first
        new Demo01();
    }
}
