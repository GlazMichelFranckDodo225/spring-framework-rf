package com.dgmf.beans;

public class Student {
    private Address address;

    public Student(Address address) {
        this.address = address;
    }

    public void print() {
        System.out.println("Student Class Method called ...");
        // address.print();
    }
}