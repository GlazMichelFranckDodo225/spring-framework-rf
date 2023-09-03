package com.dgmf.annotationbasedconfig.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.dgmf.annotationbasedconfig")
public class AppConfig {
}
