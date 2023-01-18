package com.example.springbootintrotest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Home {

    @Autowired
    public Home(Animal dog, Animal cat) {
        dog.makeSound();
        cat.makeSound();
    }
}
