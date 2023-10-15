package com.dgmf.withspringdependencyinjection;

import com.dgmf.withdependencyinjection.SmsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class Client {
    public static void main(String[] args) {
        String message = "Hi, good morning. Have a nice day !";

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        MessageSender messageSender =
                applicationContext.getBean(MessageSender.class);

        messageSender.sendMessage(message);
    }
}
