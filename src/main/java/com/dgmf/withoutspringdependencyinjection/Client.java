package com.dgmf.withoutspringdependencyinjection;

import com.dgmf.withoutspringdependencyinjection.impl.EmailServiceImpl;
import com.dgmf.withoutspringdependencyinjection.impl.SmsServiceImpl;

public class Client {
    public static void main(String[] args) {
        String message = "Hi, good morning. Have a nice day !";
        SmsService smsService = new SmsService();
        EmailService emailService = new EmailService();

        // MessageSender messageSender = new MessageSender(smsService);
        MessageSender messageSender = new MessageSender(emailService);
        messageSender.sendMessage(message);
    }
}
