package com.example.springbootintrotest;

public class Cat implements Animal {

    public Cat() {
        makeSound();
    }

    @Override
    public void makeSound() {
        System.out.println("meow");
    }
}
