package com.dgmf.javabasedconfig.interfaces.impl;

import com.dgmf.javabasedconfig.interfaces.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is moving ...");
    }
}
