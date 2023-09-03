package com.dgmf.annotationbasedconfig.interfaces.impl;

import com.dgmf.javabasedconfig.interfaces.Vehicle;
import org.springframework.stereotype.Component;

@Component("bike")
public class Bike implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is moving ...");
    }
}
