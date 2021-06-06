package com.java.learners.basic.variable;

class Emp {
    // static variable salary
    public static double salary;
    public static String name = "Mani";
}

public class StaticVariables {
    public static void main(String[] args) {
        // accessing static variable without object
        Emp.salary = 1000;
        System.out.println(Emp.name + "'s average salary:"
                + Emp.salary);
    }
}
