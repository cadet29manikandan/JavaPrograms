package com.java.learners.oops.inheritance.types;

interface oness {
    public void print_mani();
}

interface twoss {
    public void print_vs();
}

interface threes extends oness, twoss {
    public void print_mani();
}

class child implements threes {
    @Override
    public void print_mani() {
        System.out.println("Mani");
    }

    public void print_vs() {
        System.out.println("Vs");
    }
}

// Drived class
public class MultipleInheritance {
    public static void main(String[] args) {
        child c = new child();
        c.print_mani();
        c.print_vs();
        c.print_mani();
    }
}
