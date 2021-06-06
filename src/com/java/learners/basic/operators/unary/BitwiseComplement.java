package com.java.learners.basic.operators.unary;

public class BitwiseComplement {
    public static void main(String[] args) {
        // variable declaration
        int n1 = 6, n2 = -2;

        // Displaying numbers
        System.out.println("First Number = " + n1);
        System.out.println("Second Number = " + n2);

        // Performing bitwise complement
        System.out.println(n1 + "'s bitwise complement = " + ~n1);
        System.out.println(n2 + "'s bitwise complement = " + ~n2);
    }
}
