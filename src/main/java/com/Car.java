package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String mark;

    private Person person;
    public void setMark(String mark) {
        this.mark = mark;
    }
    @Autowired
    public void setPerson(Person person) {
        this.person = person;
    }

    public void start() {
        System.out.println("Its class "+getClass().getSimpleName()+":");
        System.out.println(mark + " started");
    }
}
