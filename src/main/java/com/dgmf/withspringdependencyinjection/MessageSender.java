package com.dgmf.withspringdependencyinjection;

import com.dgmf.withdependencyinjection.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    private MessageService messageService;

    @Autowired
    public MessageSender(@Qualifier("emailService") MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage(String message) {
        System.out.println("MessageSender Class");
        messageService.sendMessage(message);
    }
}
