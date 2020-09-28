package ar.com.ada.online.second.inheritanceextends;

import ar.com.ada.online.second.inheritanceextends.zoo.Dog;
import ar.com.ada.online.second.inheritanceextends.zoo.Horse;

public class Main {

    public static void main(String[] args) {
        Dog d1 = new Dog("mestizo", 4, 7);
        Dog d2 = new Dog("beagle", 4, 10);

        Horse h1 = new Horse("Caballo de Guerra", "veloz", "speed");
        Horse h2 = new Horse("Cabello Plateado", "Daenerys", "warrior");

        System.out.println("metodo toString");
        System.out.println("dog1.toString: " + d1.toString());
        System.out.println("dog2.toString: " + d2.toString());

        System.out.println();

        System.out.println("metodo hashCode");
        System.out.println("dog1.hashcode: " + d1.hashCode());
        System.out.println("dog2.hashcode: " + d2.hashCode());

        System.out.println();

        System.out.println("metodo equals");
        System.out.println("dog1.equals: " + d1.equals(d2));

        System.out.println();

        System.out.println("metodo toString");
        System.out.println("h1.toString: " + h1.toString());
        System.out.println("h2.toString: " + h2.toString());

        System.out.println();
        System.out.println("metodo hashCode");
        System.out.println("h1.hashcode: " + h1.hashCode());
        System.out.println("h2.hashcode: " + h2.hashCode());

        System.out.println();

        System.out.println("metodo equals");
        System.out.println("h1.equals: " + h1.equals(h2));

    }
}
