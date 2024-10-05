package com.apprenticeship.first_spring_app.controller;

import com.apprenticeship.first_spring_app.domain.User;
import com.apprenticeship.first_spring_app.services.HelloWorldServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController

@RequestMapping("/hello-world")

public class HelloWordController {


    private HelloWorldServices helloWorldServices;

    public HelloWordController(HelloWorldServices helloWorldServices) {
       this.helloWorldServices = helloWorldServices;
    }

    @GetMapping
     public String helloWorld() {
         return helloWorldServices.helloWorld("Keven");
     }

     @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable String id, @RequestParam(value = "filter", defaultValue = "nenhum" ) String filter, @RequestBody User body) {
        return "Hello World " + filter;
     }
}
