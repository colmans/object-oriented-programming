package ar.com.ada.online.second.inheritanceexample;

public class Transporte {
    private Integer seats;

    //constructor vacio
    public Transporte() {
    }

    //constructor con un parametro
    public Transporte(Integer seats) {
        this.seats = seats;
    }

    //getters and setters

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }
}
