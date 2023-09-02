package com.dgmf.javabasedconfig.interfaces.impl;

import com.dgmf.javabasedconfig.interfaces.Vehicle;

public class Cycle implements Vehicle {
    @Override
    public void move() {
        System.out.println("Cycle is moving ...");
    }
}
