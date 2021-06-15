package com.java.learners.todayclass.oops.inheritance.types;

class ones {
    public void print_mani() {
        System.out.println("Hair");
    }
}

class twos extends ones {
    public void print_vs() {
        System.out.println("Vs");
    }
}

class three extends twos {
    public void print_mani() {
        System.out.println("Mani");
    }
}

// Drived class
public class MultiLevelInheritance {
    public static void main(String[] args) {
        three g = new three();
        g.print_mani();
        g.print_vs();
        g.print_mani();
    }
}