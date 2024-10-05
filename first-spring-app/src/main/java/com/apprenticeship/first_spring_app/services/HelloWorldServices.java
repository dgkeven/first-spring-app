package com.apprenticeship.first_spring_app.services;


import org.springframework.stereotype.Service;

@Service

public class HelloWorldServices {

    public String helloWorld(String name) {
        return "Hello World " + name;
    }
}
