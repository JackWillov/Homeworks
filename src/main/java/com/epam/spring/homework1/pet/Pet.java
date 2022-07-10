package com.epam.spring.homework1.pet;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Pet {

    @Autowired
    private List<Animals> animalsList;
    public void printPets(){
        for (Animals animal : animalsList){
            System.out.println(animal.getAnimal());
        }
    }
}
