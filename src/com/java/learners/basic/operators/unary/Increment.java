package com.java.learners.basic.operators.unary;

public class Increment {
    public static void main(String[] args) {
        // initializing variables
        int num = 5;

        // first 5 gets printed and then
        // increment to 6
        System.out.println("Post "
                + "increment = " + num++);

        // num was 6, incremented to 7
        // then printed
        System.out.println("Pre "
                + "increment = " + ++num);
    }
}
