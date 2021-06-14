package com.java.learners.constructor;

class Sample {
    // constructor with one argument
    Sample(String name) {
        System.out.println("Constructor with one " +
                "argument - String : " + name);
    }
    // constructor with two arguments
    Sample(String name, int age) {
        System.out.println("Constructor with two arguments : " +
                " String and Integer : " + name + " " + age);

    }
    // Constructor with one argument but with different
    // type than previous..
    Sample(long id) {
        System.out.println("Constructor with one argument : " +
                "Long : " + id);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Creating the objects of the class named 'Sample'
        // by passing different arguments
        // Invoke the constructor with one argument of
        // type 'String'.
        Sample mSample1 = new Sample("Manikandan");
        // Invoke the constructor with two arguments
        Sample mSample2 = new Sample("Ajith Kumar", 26);
        // Invoke the constructor with one argument of
        // type 'Long'.
        Sample mSample3 = new Sample(325614567);
    }
}
