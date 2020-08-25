package ar.com.ada.online.second.objectexerciseone;

public class Main {

    public static void main(String[] args) {
        //se crean el objeto de tipo Animal
        Animal aninalA = new Animal();
        // se crean el objeto de tipo Vehicule
        Vehicle carA = new Vehicle();
        // se crean el objeto de tipo Person
        Person personA = new Person();

        // settear los attr
        aninalA.breed = "mestizo";
        aninalA.color = "Black";
        aninalA.name = "Palito";

        carA.color = "Rojo";
        carA.maxSpeed = 160;
        carA.brand = "Citroen-Cactus";

        personA.name ="Rosa";
        personA.lastName = "Torres";
        personA.age = 32;

        System.out.println(aninalA.breed + " " + aninalA.color + " " + aninalA.name);
        System.out.println(carA.brand + " " + carA.maxSpeed + " " + carA.color);
        System.out.println(personA.name + " " + personA.lastName + " " + personA.age);






    }
}
