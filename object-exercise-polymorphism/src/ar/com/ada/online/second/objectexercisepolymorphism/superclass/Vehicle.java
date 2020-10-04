package ar.com.ada.online.second.objectexercisepolymorphism.superclass;

import java.util.Objects;

public class Vehicle {
    protected String brand;
    protected String model;
    protected Integer year;

    //bloque constructores
    public Vehicle() {
    }

    public Vehicle(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //bloque getters and setters


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    //metodos propios de la clase
    public String technicalSheet() {
        String mensaje = "Este vehículo no\n" +
                "tiene categoría asignada";

        return String.format("Marca: %s\nModelo: %s\nAño: %d\nMensaje: %s\n",
                brand,
                model,
                year,
                mensaje);
    }

    //bloqe de sobre escritura superclase

    //bloque sobre escritura de clase object
    @Override
    public String toString() {
        return String.format(
                "Vehicle { brand = %s, model = %s, year = %d }",
                this.brand,
                this.model,
                this.year
        );

    }

    @Override
    public int hashCode() {
        return -31 * Objects.hash(brand, model, year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Vehicle that = (Vehicle) o;
        return model.equals(that.model) &&
                brand.equals(that.brand) &&
                year.equals(that.year);
    }


}
