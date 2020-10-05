package ar.com.ada.online.second.abstracts.subclass;

import ar.com.ada.online.second.abstracts.superclass.Vehicle;

import java.util.Objects;

public class ElectricalVehicle extends Vehicle {

    //bloque de atributos
    private Integer potency;

    //bloque de constructores
    public ElectricalVehicle() {
    }

    public ElectricalVehicle(Integer potency) {

        this.potency = potency;
    }

    public ElectricalVehicle(String brand, String model, Integer year, Integer potency) {
        super(brand, model, year);
        this.potency = potency;

    }

    //bloque de getters and setters

    public Integer getPotency() {
        return potency;
    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    //bloque metodos propios de la clase

    //SOBRE ESCRITURA DEL METODO TECHNICALSHEET
    @Override
    public String technicalSheet() {
        String mensaje;
        System.out.println("Caracteristicas de Vehiculo Electronico");
        if (getYear() < 2007) {
            mensaje = "No existe modelo para este año";

        } else
            mensaje = "Es un auto de última tecnología! ”";

        return String.format("Marca: %s\nModelo: %s\nAño: %d\nMensaje: %s\n",
                getBrand(),
                getModel(),
                getYear(),
                mensaje);

    }


    //bloqe de sobre escritura superclase

    //bloque sobre escritura de clase object
    @Override
    public String toString() {
        return String.format(
                "ElectricalVehicule { brand = %s, model = %s, year = %d, potency = %d }",
                getBrand(),
                getModel(),
                getYear(),
                this.potency
        );

    }

    @Override
    public int hashCode() {
        return -31 * Objects.hash(super.hashCode(), potency);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        ElectricalVehicle that = (ElectricalVehicle) o;
        return super.equals(o) && potency.equals(that.potency);
    }


}
