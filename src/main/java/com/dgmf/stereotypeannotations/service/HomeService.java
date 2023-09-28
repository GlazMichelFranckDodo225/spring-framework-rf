package com.dgmf.stereotypeannotations.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
        public String hello() {
            return "Hello Service";
        }
}
