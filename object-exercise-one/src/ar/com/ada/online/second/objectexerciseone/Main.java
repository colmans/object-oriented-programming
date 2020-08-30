package ar.com.ada.online.second.objectexerciseone;

public class Main {

    public static void main(String[] args) {
        //se crean el objeto de tipo Animal
        Animal animalA = new Animal();
        // se crean el objeto de tipo Vehiculo
        Vehicle carA = new Vehicle();
        // se crean el objeto de tipo Person
        Person personA = new Person();

        // settear los attr
        animalA.breed = "mestizo";
        animalA.color = "Black";
        animalA.name = "Palito";

        carA.color = "Rojo";
        carA.maxSpeed = 160;
        carA.brand = "Citroen-Cactus";

        personA.name = "Rosa";
        personA.lastName = "Torres";
        personA.age = 32;


        System.out.println(animalA.breed + " " + animalA.color + " " + animalA.name);
        animalA.eat();
        animalA.move();
        animalA.sleep();
        System.out.println();
        System.out.println(carA.brand + " " + carA.maxSpeed + " " + carA.color);
        carA.moveOn();
        carA.brake();
        System.out.println();
        System.out.println(personA.name + " " + personA.lastName + " " + personA.age);
        personA.play();
        personA.talk();
        personA.play();


    }
}
