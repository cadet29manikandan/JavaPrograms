package com.java.learners.basic.operators.javainstanceof;

// A Java program to show that a parent object is
// not an instance of Child
class Parents {  }
class Childs extends Parents { }

public class Example03 {
    public static void main(String[] args) {
        Parents pobj = new Parents();
        if (pobj instanceof Childs)
            System.out.println("pobj is instance of Child");
        else
            System.out.println("pobj is NOT instance of Child");
    }
}
