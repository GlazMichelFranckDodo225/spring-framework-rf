package com.dgmf.annotationbasedconfig.interfaces.impl;

import com.dgmf.javabasedconfig.interfaces.Vehicle;
import org.springframework.stereotype.Component;

@Component("car")
public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving ...");
    }
}
