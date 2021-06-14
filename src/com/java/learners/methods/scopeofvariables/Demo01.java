package com.java.learners.methods.scopeofvariables;

public class Demo01 {
    static int x = 11;
    private int y = 33;

    public void method1(int x) {
        Demo01 t = new Demo01();
        this.x = 22;
        y = 44;

        System.out.println("Test.x: " + Demo01.x);
        System.out.println("t.x: " + t.x);
        System.out.println("t.y: " + t.y);
        System.out.println("y: " + y);
    }

    public static void main(String[] args) {
        Demo01 t = new Demo01();
        t.method1(5);
    }
}
