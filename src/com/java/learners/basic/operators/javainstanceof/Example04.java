package com.java.learners.basic.operators.javainstanceof;

// A Java program to show that a parent reference
// referring to a Child is an instance of Child
class Parentss {  }
class Childss extends Parentss { }

public class Example04 {
    public static void main(String[] args) {
        // Reference is Parent type but object is
        // of child type.
        Parentss cobj = new Childss();
        if (cobj instanceof Childss)
            System.out.println("cobj is instance of Child");
        else
            System.out.println("cobj is NOT instance of Child");
    }
}
