package ar.com.ada.online.second.obj;

import ar.com.ada.online.second.obj.override.Person;

public class Main {

    public static void main(String[] args) {
        System.out.println("METODO toString");

//        Person p1 = new Person("Jon", "Snow");
//        Person p2 = new Person("Daenerys", "Targaryen");
//        Person p3 = new Person("Arya", "Stark");
//        Person p4 = new Person("Lady", "Brienne of Tarth");

        Person p1 = new Person("Jon", "Snow");
        Person p2 = new Person("Daenerys", "Targaryen");
        Person p3 = new Person("Arya", "Stark");
        Person p4 = new Person("Arya", "Stark");


        System.out.println("p1.toString() = " + p1.toString());
        System.out.println("p2.toString() = " + p2.toString());
        System.out.println("p3.toString() = " + p3.toString());
        System.out.println("p4.toString() = " + p4.toString());

        System.out.println();

        System.out.println("METODO hashCode");


        System.out.println("p1.hashCode() =" + p1.hashCode());
        System.out.println("p2.hashCode() =" + p2.hashCode());
        System.out.println("p3.hashCode() =" + p3.hashCode());
        System.out.println("p4.hashCode() =" + p4.hashCode());

        System.out.println();

        System.out.println("METODO equals");

        System.out.println("Comparacion de instancias cuando son distintas, retorna: " + p1.equals(p2));
        System.out.println("Comparacion de instancias cuando son iguales, retorna: " + p3.equals(p4));


    }
}
