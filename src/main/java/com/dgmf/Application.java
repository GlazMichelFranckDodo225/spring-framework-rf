package com.dgmf;

import com.dgmf.classes.Traveller;
import com.dgmf.config.AppConfig;
import com.dgmf.interfaces.Vehicle;
import com.dgmf.interfaces.impl.Bike;
import com.dgmf.interfaces.impl.Car;
import com.dgmf.interfaces.impl.Cycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
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

        Traveller traveller = applicationContext.getBean(Traveller.class);
        traveller.startJourney();

    }
}
