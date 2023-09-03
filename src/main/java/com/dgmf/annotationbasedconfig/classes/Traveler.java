package com.dgmf.annotationbasedconfig.classes;

import com.dgmf.javabasedconfig.interfaces.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveler")
public class Traveler {
    private Vehicle vehicle;

    @Autowired
    public Traveler(@Qualifier("cycle") Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void startJourney() {
        this.vehicle.move();
    }
}
