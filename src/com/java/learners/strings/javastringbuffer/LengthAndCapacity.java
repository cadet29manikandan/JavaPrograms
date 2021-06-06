package com.java.learners.strings.javastringbuffer;

public class LengthAndCapacity {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Manikandan");
        int p = s.length();
        int q = s.capacity();
        System.out.println("Length of string Manikandan=" + p);
        System.out.println("Capacity of string Manikandan=" + q);
    }
}
