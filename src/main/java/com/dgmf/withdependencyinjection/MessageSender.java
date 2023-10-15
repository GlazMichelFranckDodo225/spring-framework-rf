package com.dgmf.withdependencyinjection;

public class MessageSender {
    private MessageService messageService;

    public MessageSender(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage(String message) {
        System.out.println("MessageSender Class");
        messageService.sendMessage(message);
    }
}
