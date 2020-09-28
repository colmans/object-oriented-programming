package ar.com.ada.online.second.inheritanceextends.zoo;

import java.util.Objects;

public class Animal {
    private String breed;

    public Animal() {
    }

    public Animal(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return String.format(
                "Animal { Breed = %s }",
                this.breed
        );


    }

    @Override
    public int hashCode() {
        return -25 * Objects.hash(breed);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Animal that = (Animal) o;
        return breed.equals(that.breed);
    }


}
