package com.dgmf.beanannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Address address() {
        return new Address();
    }

    @Bean(
            name = "studentBean",
            initMethod = "init", // "init" ==> Name of the Method to call
            destroyMethod = "destroy" // "destroy" ==> Name of the Method to call
    )
    public Student student() {
        return new Student(address());
    }

    @Bean(name = {"teacherBean", "teacherBeanDemo"})
    public Teacher teacher() {
        return new Teacher(address());
    }
}
