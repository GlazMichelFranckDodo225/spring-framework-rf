package com.dgmf.withdependencyinjection;

public class EmailService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("EmailService");
        System.out.println(message);
    }
}
