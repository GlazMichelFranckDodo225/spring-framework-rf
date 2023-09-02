package com.dgmf.javabasedconfig.classes;

import com.dgmf.javabasedconfig.interfaces.Vehicle;

public class Traveller {
    // Car car = null;
    // Bike bike = null;
    // Cycle cycle = null;
    private Vehicle vehicle;

    /*public Traveller() {
        // this.car = new Car();
        // this.bike = new Bike();
        this.cycle = new Cycle();
    }*/

    public Traveller(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void startJourney() {
        // this.car.move();
        // this.bike.move();
        // this.cycle.move();
        this.vehicle.move();
    }
}
