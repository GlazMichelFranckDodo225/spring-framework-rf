package com.dgmf.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailService {
    private DataSource dataSource;

    // @Autowired - Can be omitted when there is only one constructor
    public EmailService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void sendEmail() {
        String[] emails = dataSource.getEmails();

        for (String email: emails) {
            System.out.println(email);
        }
    }
}
