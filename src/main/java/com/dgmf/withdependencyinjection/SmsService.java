package com.dgmf.withdependencyinjection;

public class SmsService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("SmsService");
        System.out.println(message);
    }
}
