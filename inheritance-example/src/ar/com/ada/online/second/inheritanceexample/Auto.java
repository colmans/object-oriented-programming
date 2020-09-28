package ar.com.ada.online.second.inheritanceexample;

public class Auto extends Transporte {
    private String patent;
    private String brand;

    //constructor vacio
    public Auto() {
    }

    //constructor con dos parametros
    public Auto(Integer seats, String patent, String brand) {
        super(seats);//permite llamar al atributo de la superclase
        this.patent = patent;
        this.brand = brand;
    }
    //getters and setters

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    @Override
    public String toString() {
        return String.format(
                "Auto { patent = %s, brand = %s, seats = %d }",
                this.patent,
                this.brand,
                this.getSeats()
        );

    }


}
