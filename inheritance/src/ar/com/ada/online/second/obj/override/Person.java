package ar.com.ada.online.second.obj.override;

import java.util.Objects;

public class Person {

    private String name;
    private String lastName;

    //constructor vacio
    public Person() {
    }

    //constructor con un parametro Nota: ingresar this.atributo
    public Person(String name) {
        this.name = name;
    }

    //constructor con dos parametros Nota: ingresar this.atributo
    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    //getters and setters


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person { name="
                + name +
                ", lastName=" + lastName + "}";
    }

    @Override
    public int hashCode() {
        return -31 * Objects.hash(name, lastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Person that = (Person) o;
        return name.equals(that.name) &&
                lastName.equals(that.lastName);
    }
}
