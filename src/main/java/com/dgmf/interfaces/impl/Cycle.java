package com.dgmf.interfaces.impl;

import com.dgmf.interfaces.Vehicle;

public class Cycle implements Vehicle {
    @Override
    public void move() {
        System.out.println("Cycle is moving ...");
    }
}
