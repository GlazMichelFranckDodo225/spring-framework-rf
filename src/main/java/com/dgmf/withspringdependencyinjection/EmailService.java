package com.dgmf.withspringdependencyinjection;

import com.dgmf.withdependencyinjection.MessageService;
import org.springframework.stereotype.Service;

@Service // Specialization of @Component Annotation
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("EmailService");
        System.out.println(message);
    }
}
