package com.dgmf.annotationbasedconfig;

import com.dgmf.annotationbasedconfig.classes.Traveler;
import com.dgmf.annotationbasedconfig.config.AppConfig;
import com.dgmf.annotationbasedconfig.interfaces.Vehicle;
import com.dgmf.annotationbasedconfig.interfaces.impl.Bike;
import com.dgmf.annotationbasedconfig.interfaces.impl.Car;
import com.dgmf.annotationbasedconfig.interfaces.impl.Cycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationAnnotationBasedConfig {
    public static void main(String[] args) {
        // Annotation-based Configuration
        // Creating Spring IoC Container
        // Read the Configuration Class
        // Create and manage the Spring Beans
        ApplicationContext applicationContext =
                // "AppConfig.class" from
                // ==> "com.dgmf.annotationbasedconfig.config"
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve Beans from Spring IoC Container
        /*Bike bike = applicationContext.getBean(Bike.class);
        bike.move();

        Car car = applicationContext.getBean(Car.class);
        car.move();

        Cycle cycle = applicationContext.getBean(Cycle.class);
        cycle.move();*/

        Traveler traveller = applicationContext.getBean(Traveler.class);
        traveller.startJourney();

    }
}
