package com.java.learners.methods.returnmultiplevalues;

import java.util.Arrays;
import java.util.List;

public class Demo03 {
    public static List<Object> getDetails() {
        String name = "Manikandan";
        int age = 27;
        char gender = 'M';

        return Arrays.asList(name, age, gender);
        // [Manikandan, 27, M]
    }

    // Driver code
    public static void main(String[] args) {
        List<Object> person = getDetails();
        System.out.println(person);
    }
}
