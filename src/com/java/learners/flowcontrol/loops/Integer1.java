package com.java.learners.flowcontrol.loops;

import java.util.ArrayList;

//Java program for out of memory exception.
public class Integer1 {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            ar.add(i);
        }
    }
}
