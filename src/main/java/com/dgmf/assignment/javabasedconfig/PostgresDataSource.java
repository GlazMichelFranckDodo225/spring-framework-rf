package com.dgmf.assignment.javabasedconfig;

public class PostgresDataSource implements DataSource {
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
