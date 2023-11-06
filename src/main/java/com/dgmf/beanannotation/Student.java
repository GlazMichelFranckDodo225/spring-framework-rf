package com.dgmf.beanannotation;

public class Student {
    private Address address;

    public Student(Address address) {
        this.address = address;
    }

    public void print() {
        System.out.println("Student Class Method called ...");
        // address.print();
    }

    public void init() {
        System.out.println("Initialization Logic ...");
    }

    public void destroy() {
        System.out.println("Destruction Logic ...");
    }
}