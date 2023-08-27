package com.dgmf.interfaces.impl;

import com.dgmf.interfaces.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is moving ...");
    }
}
