package com.java.learners.strings.javastringbuffer;

public class Delete {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("ManikandanKRM");
        s.delete(0, 5);
        System.out.println(s); // returns andanKRM
        s.deleteCharAt(7);
        System.out.println(s); // returns andanKR
    }
}
