package com.dgmf.assignment.annotationbasedconfig;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataSource implements DataSource {
    @Override
    public String[] getEmails() {
        String[] emails = {
                "johndoe@gmail.com",
                "natashacarmin@gmail.com",
                "donovanlagherty@gmail.com"
        };

        return emails;
    }
}
