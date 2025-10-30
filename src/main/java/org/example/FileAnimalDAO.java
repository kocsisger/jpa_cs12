package org.example;

import java.util.List;

public class FileAnimalDAO implements AnimalDAO{
    @Override
    public void saveAnimal(Animal a) {
        System.out.println("Animal saved");
    }

    @Override
    public List<Animal> getAnimals() {
        System.out.println("List");
        return List.of();
    }

    @Override
    public void updateAnimal(Animal a) {

    }

    @Override
    public void deleteAnimal(Animal a) {

    }
}
