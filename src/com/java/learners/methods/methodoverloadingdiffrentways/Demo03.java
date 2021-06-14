package com.java.learners.methods.methodoverloadingdiffrentways;

class Test {
    public void testIdentity(String name, int id) {
        System.out.println("testName : " + name + " "
                + "Id : " + id);
    }

    public void testIdentity(int id, String name) {
        System.out.println("Id : " + id + " "
                + "testName : " + name);
    }
}

public class Demo03 {
    public static void main(String[] args) {
        Test mTest = new Test();

        mTest.testIdentity("Mani", 1);
        mTest.testIdentity("Ajith", 2);

        System.out.println();

        mTest.testIdentity(1, "Mani");
        mTest.testIdentity(2, "Ajith");
    }
}
