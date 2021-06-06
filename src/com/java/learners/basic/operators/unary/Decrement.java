package com.java.learners.basic.operators.unary;

public class Decrement {
    public static void main(String[] args) {
        // initializing variables
        int num = 5;

        // first 5 gets printed and then
        // decremented to 4
        System.out.println("Post "
                + "decrement = " + num--);

        System.out.println("num = " + num);

        // num was 4, decremented to 3
        // then printed
        System.out.println("Pre "
                + "decrement = " + --num);
    }
}
