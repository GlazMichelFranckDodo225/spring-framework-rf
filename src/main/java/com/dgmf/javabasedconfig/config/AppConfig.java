package com.dgmf.javabasedconfig.config;

import com.dgmf.javabasedconfig.classes.Traveller;
import com.dgmf.javabasedconfig.interfaces.Vehicle;
import com.dgmf.javabasedconfig.interfaces.impl.Bike;
import com.dgmf.javabasedconfig.interfaces.impl.Car;
import com.dgmf.javabasedconfig.interfaces.impl.Cycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Vehicle bike() {
        return new Bike();
    }

    @Bean
    public Vehicle car() {
        return new Car();
    }

    @Bean
    public Vehicle cycle() {
        return new Cycle();
    }

    @Bean
    public Traveller traveller() {
        // return new Traveller(car()); // Dependency Injection (DI)
        // return new Traveller(bike()); // Dependency Injection (DI)
        return new Traveller(cycle()); // Dependency Injection (DI)
    }
}
