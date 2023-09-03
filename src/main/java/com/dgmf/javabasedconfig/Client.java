package com.dgmf.javabasedconfig;

import com.dgmf.javabasedconfig.classes.Traveler;
import com.dgmf.javabasedconfig.interfaces.Vehicle;
import com.dgmf.javabasedconfig.interfaces.impl.Cycle;

public class Client {
    public static void main(String[] args) {
        // Vehicle vehicle = new Car();
        // Vehicle vehicle = new Bike();
        Vehicle vehicle = new Cycle();

        // Traveller traveller = new Traveller(car);
        // Traveller traveller = new Traveller(bike);
        Traveler traveller = new Traveler(vehicle);
        traveller.startJourney();
    }
}
