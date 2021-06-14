package com.java.learners.constructor.constructorchaining;

public class Demo02 {
    // default constructor 1
    Demo02() {
        System.out.println("default");
    }

    // parameterized constructor 2
    Demo02(int x) {
        // invokes default constructor
        this();
        System.out.println(x);
    }

    // parameterized constructor 3
    Demo02(int x, int y) {
        // invokes parameterized constructor 2
        this(5);
        System.out.println(x * y);
    }

    public static void main(String[] args) {
        // invokes parameterized constructor 3
        new Demo02(8, 10);
    }
}
