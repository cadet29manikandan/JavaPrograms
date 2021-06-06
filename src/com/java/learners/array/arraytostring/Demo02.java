package com.java.learners.array.arraytostring;

public class Demo02 {
    public static void main(String[] args) {

        StringBuilder sbf
                = new StringBuilder("We are Java ");
        System.out.println(sbf);

        // Char array
        char[] astr
                = new char[]{'L', 'E', 'A', 'R', 'N'};

        // Appends string representation of char
        // array to this String Builder
        sbf.append(astr);
        System.out.println("Result after"
                + " appending = "
                + sbf);

        sbf = new StringBuilder("We are -");
        System.out.println(sbf);

        // Char array
        astr = new char[]{'a', 'b', 'c', 'd'};

        /* Appends string representation of char
                array to this StringBuilder */
        sbf.append(astr);
        System.out.println("Result after appending = " + sbf);
    }
}
