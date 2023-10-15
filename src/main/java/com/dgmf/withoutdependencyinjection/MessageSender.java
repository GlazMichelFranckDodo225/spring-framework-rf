package com.dgmf.withoutdependencyinjection;

public class MessageSender {
    // private SmsService smsService;
    private EmailService emailService;

    /*public MessageSender(SmsService smsService) {
        this.smsService = smsService;
    }*/

    public MessageSender(EmailService smsService) {
        this.emailService = smsService;
    }

    public void sendMessage(String message) {
        System.out.println("MessageSender Class");
        // smsService.sendMessage(message);
        emailService.sendMessage(message);
    }
}
