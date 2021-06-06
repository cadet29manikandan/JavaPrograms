package com.java.learners.array;

import java.util.Scanner;

public class MultiDimensionArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // totalTestCases = 2, eachTestCaseValues = 2
        int totalTestCases, eachTestCaseValues;

        // 2
        totalTestCases = scanner.nextInt();

        // int[][] arrayMain = new int[2][];
        // { {}, {} }
        int[][] arrayMain = new int[totalTestCases][];

        // for (int i = 0; i < 2; i++)
        for (int i = 0; i < arrayMain.length; i++) {
            // 3
            eachTestCaseValues = scanner.nextInt();
            // arrayMain[1] = new int[3];
            arrayMain[i] = new int[eachTestCaseValues];
            // for (int j = 0; j < 3; j++)
            for (int j = 0; j < arrayMain[i].length; j++) {
                //  arrayMain[0][0] = scanner.nextInt();
                arrayMain[i][j] = scanner.nextInt();
                // 1, 2, 3
            }
        }

        // for (int i = 0; i < 2; i++)
        for (int i = 0; i < arrayMain.length; i++) {
            int nEvenNumbers = 0, nOddNumbers = 0;

            // TestCase 0 with 2 values :
            System.out.println(
                    "TestCase " + i + " with "
                            + arrayMain[i].length + " values:");

            // int j = 0; j < 3; j++
            for (int j = 0; j < arrayMain[i].length; j++) {
                // System.out.print(arrayMain[0][2] + " ") : 3
                System.out.print(arrayMain[i][j] + " ");
                if (arrayMain[i][j] % 2 == 0) {
                    nEvenNumbers++; // 0 + 1
                }
                else {
                    nOddNumbers++; // 0 + 1
                }
            }
            System.out.println();

            // Total Even numbers: 1, Total Odd numbers: 2
            System.out.println(
                    "Total Even numbers: " + nEvenNumbers
                            + ", Total Odd numbers: " + nOddNumbers);
        }
    }
}
