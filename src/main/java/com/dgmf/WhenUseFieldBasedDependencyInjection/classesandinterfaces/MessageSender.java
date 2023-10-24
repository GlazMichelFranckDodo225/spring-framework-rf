package com.dgmf.WhenUseFieldBasedDependencyInjection.classesandinterfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    @Autowired
    @Qualifier("emailService")
    private MessageService emailService;
    @Autowired
    private MessageService smsService;

    public void sendMessage(String message) {
        System.out.println("MessageSender Class");

        emailService.sendMessage(message);
        smsService.sendMessage(message);
    }
}
