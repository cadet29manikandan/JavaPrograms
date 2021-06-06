package com.java.learners.basic.comments;

/**
 * <h1>Find average of three numbers!</h1>
 * The FindAvg program implements an application that
 * simply calculates average of three integers and Prints
 * the output on the screen.
 *
 * @author Manikandan
 * @version 1.0
 * @since 2021-06-05
 */
public class Documentation {
    /**
     * This method is used to find average of three integers.
     *
     * @param numA This is the first parameter to findAvg method
     * @param numB This is the second parameter to findAvg method
     * @param numC This is the second parameter to findAvg method
     * @return int This returns average of numA, numB and numC.
     */

    public int findAvg(int numA, int numB, int numC) {
        return (numA + numB + numC) / 3;
    }

    /**
     * This is the main method which makes use of findAvg method.
     * @param args Unused.
     * @return Nothing.
     */

    public static void main(String[] args) {
        Documentation obj = new Documentation();
        int avg = obj.findAvg(10, 20, 30);

        System.out.println("Average of 10, 20 and 30 is :" + avg);
    }
}
