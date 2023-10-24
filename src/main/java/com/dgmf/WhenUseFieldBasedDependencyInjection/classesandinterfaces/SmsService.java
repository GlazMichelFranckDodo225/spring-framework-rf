package com.dgmf.WhenUseFieldBasedDependencyInjection.classesandinterfaces;

import org.springframework.stereotype.Service;

@Service
public class SmsService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("SmsService");

        System.out.println(message);
    }
}
