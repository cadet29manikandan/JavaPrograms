package com.java.learners.methods.returnmultiplevalues;

class MultiDivAdd {
    int mul; // To store multiplication
    double div; // To store division
    int add; // To store addition

    MultiDivAdd(int m, double d, int a) {
        mul = m;
        div = d;
        add = a;
    }
}

public class Demo02 {
    static MultiDivAdd getMultDivAdd(int a, int b) {
        // Returning multiple values of different
        // types by returning an object
        return new MultiDivAdd(a * b,  (double) a / b, (a + b));
    }

    // Driver code
    public static void main(String[] args) {
        MultiDivAdd ans = getMultDivAdd(10, 20);
        System.out.println("Multiplication = " + ans.mul);
        System.out.println("Division = " + ans.div);
        System.out.println("Addition = " + ans.add);
    }
}