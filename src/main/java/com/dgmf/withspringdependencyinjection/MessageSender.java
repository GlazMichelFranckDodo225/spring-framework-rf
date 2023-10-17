package com.dgmf.withspringdependencyinjection;

import com.dgmf.withdependencyinjection.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    private MessageService messageService;
    private MessageService smsService;

    // @Autowired // Constructor-based Dependency Injection
    public MessageSender(
            @Qualifier("emailService") MessageService messageService) {
        this.messageService = messageService;

        System.out.println("Constructor-based Dependency Injection");
    }

    @Autowired // Constructor-based Dependency Injection
    public MessageSender(
            @Qualifier("emailService") MessageService messageService,
            MessageService smsService
            ) {
        this.messageService = messageService;
        this.smsService = smsService;

        System.out.println("Constructor-based Dependency Injection 2");
    }

    public void sendMessage(String message) {
        System.out.println("MessageSender Class");
        messageService.sendMessage(message);
        smsService.sendMessage(message);
    }
}
