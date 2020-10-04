package ar.com.ada.online.second.javaaccessibility.access.modifiers;

//clases , atributos y metodo por defecto se usa el ñuflito para identificarlo, se borra el public de la clase
class Dog {

    String breed;
    String colour;

    void showAttributeValues() {
        System.out.println("breed: " + breed);
        System.out.println("colour: " + colour);
    }
}
