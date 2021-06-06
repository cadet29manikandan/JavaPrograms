package com.java.learners.basic.operators.javainstanceof;

// Java program to demonstrate that instanceof
// returns false for null
class Test {  }

public class Example02 {
    public static void main(String[] args) {
        Test tobj = null;

        // A simple case
        if (tobj instanceof Test)
            System.out.println("tobj is instance of Test");
        else
            System.out.println("tobj is NOT instance of Test");
    }
}
