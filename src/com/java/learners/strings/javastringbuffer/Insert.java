package com.java.learners.strings.javastringbuffer;

public class Insert {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("ManiKDan");
        s.insert(5, "an");
        System.out.println(s); // returns ManiKanDan

        s.insert(0, 5);
        System.out.println(s); // returns 5ManiKanDan

        s.insert(3, true);
        System.out.println(s); // returns 5MatrueniKanDan

        s.insert(5, 41.35d);
        System.out.println(s); // returns 5Matr41.35ueniKanDan

        s.insert(8, 41.35f);
        System.out.println(s); // returns 5Matr41.41.3535ueniKanDan

        char mani_arr[] = {'m', 'a', 'n', 'i', 'k'};

        // insert character array at offset 9
        s.insert(2, mani_arr);
        System.out.println(s); // returns 5Mmanikatr41.41.3535ueniKanDan
    }
}
