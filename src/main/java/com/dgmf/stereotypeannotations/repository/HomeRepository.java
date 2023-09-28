package com.dgmf.stereotypeannotations.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HomeRepository {
    public String hello() {
        return "Hello Repository";
    }
}
