package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {

    @Bean(name = "carApp")
    public Car getCar() {
        return new Car();
    }

    @Bean(name = "catApp")
    public Cat getCat() {
        return new Cat();
    }

    @Bean(name = "helloWorldApp")
    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }
}

