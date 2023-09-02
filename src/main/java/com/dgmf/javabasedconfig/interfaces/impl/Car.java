package com.dgmf.javabasedconfig.interfaces.impl;

import com.dgmf.javabasedconfig.interfaces.Vehicle;

public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving ...");
    }
}
