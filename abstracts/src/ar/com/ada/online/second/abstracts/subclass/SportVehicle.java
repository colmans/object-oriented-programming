package ar.com.ada.online.second.abstracts.subclass;

import ar.com.ada.online.second.abstracts.superclass.Vehicle;

import java.util.Objects;

public class SportVehicle extends Vehicle {
    //bloque de atributos
    private Integer rpm;


    //bloque de constructores
    public SportVehicle() {
    }

    public SportVehicle(Integer rpm) {
        this.rpm = rpm;
    }

    public SportVehicle(String brand, String model, Integer year, Integer rpm) {
        super(brand, model, year);
        this.rpm = rpm;
    }

    //bloque de getters and setters

    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    //blorque de metodos propios de la clase

    //SOBREESCRITURA DE technicalSheet, @indica que es una escritura, no es obligatorio pero es bueno ponerlo
    @Override
    public String technicalSheet() {
        String mensaje;
        System.out.println("Caracteristica de un Vehiculo Deportivo");
        if (rpm > 0 && rpm <= 50) {
            mensaje = "El auto es muy bonito, pero solo sirve para salir a pasear ”";

        } else if (rpm >= 51 && rpm <= 300) {
            mensaje = "“ Con este auto puedes desafiar a cualquiera en la pista ”";
        } else if (rpm >= 301 && rpm <= 600) {
            mensaje = "Si tienes este auto, debe considerar participar en NASCAR";
        } else
            mensaje = "¿Eres parte del elenco de rápidos y furiosos?";

        return String.format("Marca: %s\nModelo: %s\nAño: %d\nrpm: %d\nMensaje: %s\n",
                getBrand(),
                getModel(),
                getYear(),
                this.rpm,
                mensaje);
    }
    //bloque de sobreescritura de la SuperClase

    //bloque de sobreescritura de la Clase Object
    @Override
    public String toString() {
        return String.format(
                "SportVehicle { brand = %s, model = %s, year = %d, rpm = %d }",
                getBrand(),
                getModel(),
                getYear(),
                this.rpm
        );

    }

    @Override
    public int hashCode() {
        return -31 * Objects.hash(super.hashCode(), rpm);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        SportVehicle that = (SportVehicle) o;
        return super.equals(o) && rpm.equals(that.rpm);
    }

}
