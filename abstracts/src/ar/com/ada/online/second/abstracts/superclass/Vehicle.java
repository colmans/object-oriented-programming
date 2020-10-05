package ar.com.ada.online.second.abstracts.superclass;

import java.util.Objects;

//declaro la clase ABSTRACT
public abstract class Vehicle {

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
    //eset metodo deberia ser abstracto porque podria ser cualquier tipo de vh
    //el metodo abstracto no tiene cuerpo
    public abstract String technicalSheet();//recordar declkarar la clase abstract

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
