package com.java.learners.methods.scopeofvariables;

public class Demo04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        int i = 20;
        System.out.println(i);
    }
}
