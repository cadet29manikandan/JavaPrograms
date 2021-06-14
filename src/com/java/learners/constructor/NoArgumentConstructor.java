package com.java.learners.constructor;

class Test {
    int num;
    String name;

    // this would be invoked while an object
    // of that class is created.
    Test() {
        System.out.println("Constructor called");
    }
}

public class NoArgumentConstructor {
    public static void main(String[] args) {
        // this would invoke default constructor.
        Test mTest = new Test();

        // Default constructor provides the default
        // values to the object like 0, null
        System.out.println(mTest.name);
        System.out.println(mTest.num);
    }
}
