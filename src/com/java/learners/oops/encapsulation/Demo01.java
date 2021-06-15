package com.java.learners.oops.encapsulation;

// Java program to demonstrate encapsulation
class Encapsulate {
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String testName;
    private int testRoll;
    private int testAge;

    // get method for age to access
    // private variable testAge
    public int getAge() {
        return testAge;
    }

    // get method for name to access
    // private variable testName
    public String getName() {
        return testName;
    }

    // get method for roll to access
    // private variable testRoll
    public int getRoll() {
        return testRoll;
    }

    // set method for age to access
    // private variable testAge
    public void setAge(int newAge) {
        testAge = newAge;
    }

    // set method for name to access
    // private variable testName
    public void setName(String newName) {
        testName = newName;
    }

    // set method for roll to access
    // private variable testRoll
    public void setRoll(int newRoll) {
        testRoll = newRoll;
    }
}

public class Demo01 {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        // setting values of the variables
        obj.setName("Mani");
        obj.setAge(27);
        obj.setRoll(41);

        // Displaying values of the variables
        System.out.println("Test's name: " + obj.getName());
        System.out.println("Test's age: " + obj.getAge());
        System.out.println("Test's roll: " + obj.getRoll());

        // Direct access of testRoll is not possible
        // due to encapsulation
        // System.out.println("Test's roll: " + obj.testName);
    }
}