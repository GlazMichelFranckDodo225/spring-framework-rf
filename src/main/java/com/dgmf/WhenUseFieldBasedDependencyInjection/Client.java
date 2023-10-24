package com.dgmf.WhenUseFieldBasedDependencyInjection;

import com.dgmf.WhenUseFieldBasedDependencyInjection.classesandinterfaces.AppConfig;
import com.dgmf.WhenUseFieldBasedDependencyInjection.classesandinterfaces.MessageSender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        String message = "Hi, good morning. Have a nice day !";

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        MessageSender messageSender = context.getBean(MessageSender.class);
        messageSender.sendMessage(message);
    }
}
