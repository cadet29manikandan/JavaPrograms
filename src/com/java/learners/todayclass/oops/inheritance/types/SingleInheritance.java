package com.java.learners.todayclass.oops.inheritance.types;

class one {
    public void print_mani() {
        System.out.println("Mani");
    }
}

class two extends one {
    public void print_vs() {
        System.out.println("Vs");
    }
}

// Driver class
public class SingleInheritance {
    public static void main(String[] args) {
        two m = new two();
        m.print_mani();
        m.print_vs();
        m.print_mani();
    }
}
