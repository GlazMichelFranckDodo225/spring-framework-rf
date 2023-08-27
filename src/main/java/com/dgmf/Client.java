package com.dgmf;

import com.dgmf.classes.Traveller;
import com.dgmf.interfaces.Vehicle;
import com.dgmf.interfaces.impl.Bike;
import com.dgmf.interfaces.impl.Car;
import com.dgmf.interfaces.impl.Cycle;

public class Client {
    public static void main(String[] args) {
        // Vehicle vehicle = new Car();
        // Vehicle vehicle = new Bike();
        Vehicle vehicle = new Cycle();

        // Traveller traveller = new Traveller(car);
        // Traveller traveller = new Traveller(bike);
        Traveller traveller = new Traveller(vehicle);
        traveller.startJourney();
    }
}
