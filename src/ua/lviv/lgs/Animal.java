package ua.lviv.lgs;

import java.util.Objects;

public class Animal {
    String animalType;
    String animalName;

    public Animal(String animalType, String animalName) {
        this.animalType = animalType;
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + animalType + '\'' +
                ", animalName='" + animalName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return animalType.equals(animal.animalType) && animalName.equals(animal.animalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalType, animalName);
    }
}
