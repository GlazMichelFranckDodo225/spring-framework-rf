package com.dgmf.assignment.annotationbasedconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.dgmf.assignment")
public class AppConfig {
}
