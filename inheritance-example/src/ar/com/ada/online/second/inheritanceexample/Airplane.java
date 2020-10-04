package ar.com.ada.online.second.inheritanceexample;

public class Airplane extends Transporte {
    private String motorType;
    private String model;

    //metodos
    public Airplane() {
    }


    public Airplane(String motorType, String model) {
        this.motorType = motorType;
        this.model = model;
    }

    public Airplane(Integer seats, String motorType, String model) {
        super(seats);
        this.motorType = motorType;
        this.model = model;
    }


    //getters and setters

    public String getMotorType() {
        return this.motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format(
                "Aeroplane { motorType = %s, model = %s, seats = %d }",
                this.motorType,
                this.model,
                this.getSeats()
        );

    }
}
