package com.java.learners.constructor.constructorchaining;

public class Demo05 {
    // block to be excuted first
    {
        System.out.println("init");
    }

    Demo05() {
        System.out.println("default");
    }

    Demo05(int x) {
        System.out.println(x);
    }

    // block to be executed after the first block
    // which has been defined above.
    {
        System.out.println("second");
    }

    public static void main(String[] args) {
        new Demo05();
        new Demo05(10);
    }
}
