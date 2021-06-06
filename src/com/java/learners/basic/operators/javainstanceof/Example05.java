package com.java.learners.basic.operators.javainstanceof;

// A Java program to demonstrate that non-method
// members are accessed according to reference
// type (Unlike methods which are accessed according
// to the referred object)
class Parentm {
    int value = 1000;
}

class Childm extends Parentm {
    int value = 10;
}

public class Example05 {
    public static void main(String[] args) {
        Parentm cobj = new Childm();
        Parentm par = cobj;

        // Using instanceof to make sure that par
        // is a valid reference before typecasting
        if (par instanceof Childm)
        {
            System.out.println("Value accessed through " +
                    "parent reference with typecasting is " +
                    ((Childm)par).value);
        }
    }
}
