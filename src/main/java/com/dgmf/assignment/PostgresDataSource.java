package com.dgmf.assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgresDataSource implements DataSource{
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
