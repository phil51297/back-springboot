package com.app.springapi.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloGraphQLController {

    @QueryMapping
    public String helloWorld() {
        return "Hello world from GraphQL";
    }
}

