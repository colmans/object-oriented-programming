package ar.com.ada.online.second.inheritanceextends.zoo;

import java.util.Objects;

public class Horse extends Animal {

    private String name;
    private String power;

    public Horse() {
    }

    public Horse(String breed, String name, String power) {
        super(breed);
        this.name = name;
        this.power = power;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format(
                "Horse { Name = %s, power = %s, breed = %s }",
                this.name,
                this.power,
                this.getBreed()
        );

//        @Override
//        public int hashCode() {
//            return -31 * Objects.hash(name, power, getBreed());
//        }

    }
}
