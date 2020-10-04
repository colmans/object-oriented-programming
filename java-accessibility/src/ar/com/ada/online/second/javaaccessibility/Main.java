package ar.com.ada.online.second.javaaccessibility; //paqute raiz

import ar.com.ada.online.second.javaaccessibility.access.modifiers.Bank;
//importa el paquete access.modifiers que contiene la clase Bank
import ar.com.ada.online.second.javaaccessibility.access.modifiers.Person;
//importa el paquete access.modifiers que contiene la clase Persona que se encuentra
import ar.com.ada.online.second.javaaccessibility.access.modifiers.Users;
//importa el paquete access.modifiers que contiene la clase Users

public class Main {

    public static void main(String[] args) {
        // instanciamos un objeto persona

        Person p1 = new Person();
        p1.name = "Jon";
        p1.lastName = "Snow";
        p1.age = 25;

        // llamamos el metodo
        p1.showAttributeValues();

        Users u1 = new Users();
        // u1.nickname no lo puedo usar porque Users esta en un paquete diferente a main y como esta protected no
        // lo puedo usar

        // DOG: la clase Dog por defecto no lo puedo ver, no puedo hacer un NEW en MAIN porque
        // la clase DOG esta en otro ´paquete (accesss.modifiers) y al estar declarada por defecto
        // solo puedo usarla dentro del paquete donde fue creado

        Bank b1 = new Bank();
        //puedo llamar la clase Bank
        //pero no puedo usar sus atributos porque son private
        //b1.numberAccount no se puede usar el atributo
        //solo a modo de ejemplo, no se debe crear un objeto b1 si no puedo usar sus atributos
    }
}
