package com.java.learners.basic.readinput;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

// Java program to demonstrate BufferedReader
public class Buffer {
    public static void main(String[] args)
            throws IOException
    {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String name = reader.readLine();

        // Printing the read line
        System.out.println(name);
    }
}