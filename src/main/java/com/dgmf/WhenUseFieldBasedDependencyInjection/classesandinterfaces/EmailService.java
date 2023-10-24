package com.dgmf.WhenUseFieldBasedDependencyInjection.classesandinterfaces;

import org.springframework.stereotype.Service;

@Service
public class EmailService implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("EmailService");

        System.out.println(message);
    }
}
