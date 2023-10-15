package com.dgmf.withspringdependencyinjection;

import com.dgmf.withdependencyinjection.MessageService;
import org.springframework.stereotype.Service;

@Service // Specialization of @Component Annotation
public class SmsService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("SmsService");
        System.out.println(message);
    }
}
