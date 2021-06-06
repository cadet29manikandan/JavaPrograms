package com.java.learners.strings.javastringbuffer;

public class Replace {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("ManikanDan");
        s.replace(5, 8, "Kan");
        System.out.println(s); // returns ManiKanDan
    }
}
