package com.dgmf.assignment.javabasedconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.dgmf.assignment")
public class AppConfig {
    @Bean
    public DataSource mysqlDataSource() {
        return new MySQLDataSource();
    }

    @Bean
    public DataSource postgresDataSource() {
        return new PostgresDataSource();
    }

    @Bean
    public EmailService emailService() {
        return new EmailService(postgresDataSource());
    }
}
