package com.java.learners.strings.javastringbuffer;

public class Append {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("ManiKan");
        s.append("Dan");
        System.out.println(s); // returns ManiKanDan
        s.append(1);
        System.out.println(s); // returns ManiKanDan1
    }
}
