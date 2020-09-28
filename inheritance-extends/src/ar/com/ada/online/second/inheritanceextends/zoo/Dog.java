package ar.com.ada.online.second.inheritanceextends.zoo;

public class Dog extends Animal {

    private Integer legs;
    private Integer age;

    public Dog() {
    }

    public Dog(String breed, Integer legs, Integer age) {
        super(breed);
        this.legs = legs;
        this.age = age;

    }

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format(
                "Dog { legs = %d, age = %d, breed = %s }",
                this.legs,
                this.age,
                this.getBreed()
        );

    }
}
