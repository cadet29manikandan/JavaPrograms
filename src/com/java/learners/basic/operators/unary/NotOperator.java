package com.java.learners.basic.operators.unary;

public class NotOperator {
    public static void main(String[] args) {
        // initializing variables
        boolean cond = true;
        int a = 10, b = 1;

        // Displaying cond, a, b
        System.out.println("Cond is: " + cond);
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);

        // Using unary NOT operator
        System.out.println("Now cond is: " + !cond);
        System.out.println("!(a < b) = " + !(a < b));
        System.out.println("!(a > b) = " + !(a > b));
    }
}
