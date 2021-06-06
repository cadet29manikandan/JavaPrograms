package com.java.learners.flowcontrol.forloop;

public class enhancedforloop {
    public static void main(String[] args) {
        String array[] = {"Mani", "Hari", "Vinoth"};

        // enhanced for loop
        for (String x : array) {
            System.out.println(x);
        }

        /* for loop for same function
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
        */
    }
}
