package com.java.learners.constructor.constructoroverloading;

public class Demo02 {
    double width, height, depth;
    int boxNo;

    // constructor used when all dimensions and
    // boxNo specified
    Demo02(double w, double h, double d, int num) {
        width = w;
        height = h;
        depth = d;
        boxNo = num;
    }

    // constructor used when no dimensions specified
    Demo02() {
        // an empty box
        width = height = depth = 0;
    }

    // constructor used when only boxNo specified
    Demo02(int num) {
        // this() is used for calling the default
        // constructor from parameterized constructor
        this();
        boxNo = num;
    }

    public static void main(String[] args) {
        // create box using only boxNo
        Demo02 mDemo = new Demo02(1);
        // getting initial width of box1
        System.out.println(mDemo.width);
    }
}
