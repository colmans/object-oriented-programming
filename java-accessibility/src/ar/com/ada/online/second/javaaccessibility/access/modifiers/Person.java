package ar.com.ada.online.second.javaaccessibility.access.modifiers;

public class Person { // clase de acceso publico

    //atributos de acceso publico
    public String name;
    public String lastName;
    public Integer age;

    //metodo de acceso publico
    public void showAttributeValues() {
        System.out.println("name: " + this.name);
        System.out.println("lastName: " + this.lastName);
        System.out.println("age: " + age);

    }


}
