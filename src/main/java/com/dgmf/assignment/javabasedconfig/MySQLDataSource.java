package com.dgmf.assignment.javabasedconfig;

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
