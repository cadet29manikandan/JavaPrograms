package com.java.learners.flowcontrol.loops;

public class enhancedforloop {
    public static void main(String[] args) {
        String array[] = {"Mani", "Hair", "Vinoth"};

        //enhanced for loop
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
