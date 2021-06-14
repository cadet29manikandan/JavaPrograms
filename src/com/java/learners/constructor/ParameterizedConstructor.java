package com.java.learners.constructor;

class Tests {
    // data members of the class.
    String name;
    int id;

    // constructor would initialize data members
    // with the values of passed arguments while
    // object of that class created.
    Tests(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        // this would invoke the parameterized constructor.
        Tests mTest = new Tests("Mani", 1);
        System.out.println("TestName : " + mTest.name +
                " and TestId : " + mTest.id);
    }
}
