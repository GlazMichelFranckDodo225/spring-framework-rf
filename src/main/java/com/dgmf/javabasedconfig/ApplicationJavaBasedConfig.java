package com.dgmf.javabasedconfig;

import com.dgmf.javabasedconfig.classes.Traveler;
import com.dgmf.javabasedconfig.config.AppConfig;
import com.dgmf.javabasedconfig.interfaces.Vehicle;
import com.dgmf.javabasedconfig.interfaces.impl.Bike;
import com.dgmf.javabasedconfig.interfaces.impl.Car;
import com.dgmf.javabasedconfig.interfaces.impl.Cycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationJavaBasedConfig {
    public static void main(String[] args) {
        // Java-based Configuration
        // Creating Spring IoC Container
        // Read the Configuration Class
        // Create and manage the Spring Beans
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve Beans from Spring IoC Container
        Vehicle bike = applicationContext.getBean(Bike.class);
        bike.move();

        Vehicle car = applicationContext.getBean(Car.class);
        car.move();

        Vehicle cycle = applicationContext.getBean(Cycle.class);
        cycle.move();

        Traveler traveller = applicationContext.getBean(Traveler.class);
        traveller.startJourney();

    }
}
