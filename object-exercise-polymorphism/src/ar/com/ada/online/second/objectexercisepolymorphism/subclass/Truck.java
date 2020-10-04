package ar.com.ada.online.second.objectexercisepolymorphism.subclass;

import ar.com.ada.online.second.objectexercisepolymorphism.superclass.Vehicle;

import java.util.Objects;

public class Truck extends Vehicle {
    //bloque de atributos
    private Integer maxLoad;

    //bloque de constructores
    public Truck() {
    }

    public Truck(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Truck(String brand, String model, Integer year, Integer maxLoad) {
        super(brand, model, year);
        this.maxLoad = maxLoad;
    }
    //bloque de getters and setters


    public Integer getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    //bloque de los metodos propios de la clase
    public String technicalSheet() {
        String mensaje;
        System.out.println("Caracteristicas de un camion");
        if (maxLoad >= 101) {
            mensaje = "Tienes que usar este auto en el campo, es una máquina de trabajo!!";

        } else
            mensaje = "Para iniciar un negocio de flete, está muy bien este auto";


        return String.format("Marca: %s\nModelo: %s\nAño: %d\nmaxLoad: %d\nMensaje: %s\n",
                getBrand(),
                getModel(),
                getYear(),
                this.maxLoad,
                mensaje);
    }


    //bloque de sobre escritura de la Super Clase

    //bloque de la sobre escritura de la clase ocject

    @Override
    public String toString() {
        return String.format(
                "Truck { brand = %s, model = %s, year = %d, maxLoad = %d }",
                getBrand(),
                getModel(),
                getYear(),
                this.maxLoad
        );
    }

    @Override
    public int hashCode() {
        return -31 * Objects.hash(super.hashCode(), maxLoad);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Truck that = (Truck) o;
        return getModel().equals(that.getModel()) &&
                getBrand().equals(that.getBrand());
    }
}