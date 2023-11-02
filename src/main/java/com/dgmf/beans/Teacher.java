package com.dgmf.beans;

public class Teacher {
    private Address address;

    public Teacher(Address address) {
        this.address = address;
    }

    public void print() {
        System.out.println("Teacher Class Method called ...");
        // address.print();
    }
}
