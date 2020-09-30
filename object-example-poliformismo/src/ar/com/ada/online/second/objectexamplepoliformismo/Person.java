package ar.com.ada.online.second.objectexamplepoliformismo;

public class Person {
    //bloque de atributos
    private String name;
    private String lastName;

    //bloque de constructores
    public Person() {
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    //bloque de setters and getters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //bloque metodos propios de la clase


    //definicion ORIGINAL DEL METODO
    public void showRecordFile() {
        System.out.println("Expediente de Persona:");
        System.out.printf("Nombre: %s\n", this.name);
        System.out.printf("Apellido: %s\n", this.lastName);
        System.out.print("\n");//solo un salto de linea


    }
    //bloqe de sobre escritura superclase


    //bloque sobre escritura de clase object
    @Override
    public String toString() {
        return String.format(
                "Person { Name = %s, LastName = %s }",
                this.name,
                this.lastName
        );


    }


}
