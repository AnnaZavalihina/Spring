package com;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private int age;
    public void say(){
        System.out.println("Its class "+getClass().getSimpleName()+":");
        System.out.println("Hello. im "+age);
    }
    private Cat cat;

    public Cat getCat() {
        return cat;
    }

    public Person(Cat cat) {
        this.cat = cat;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
