package ar.com.ada.online.second.objectorientedprogramming.myfirstobject;

public class Person {
    //declaro los ATRIBUTOS
    String name;
    String lastName;


    //creo los METODOS- UTILIZO VOID que es la palabra reservada para mostrar los atributos de la clase
    void showAttributeValues() {
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + this.lastName);//this: busca dentro de la misma clase el atributo lastname

    }
}

