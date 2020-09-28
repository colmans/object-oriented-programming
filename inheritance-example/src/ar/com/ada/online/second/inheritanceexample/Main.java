package ar.com.ada.online.second.inheritanceexample;

public class Main {

    public static void main(String[] args) {
        //instancio un objeto

        Auto a1 = new Auto(5, "BSB123", "Ford");

        System.out.println("ma1: " + a1.toString());

        Airplane air1 = new Airplane(30, "Speed", "Americano");
        System.out.println("air1: " + air1.toString());
        //System.out.println("Primer objeto: " + a1.getSeats()+ a1.getBrand() + " " + a1.getPatent());

        // el objeto auto tendrá los attr y métodos propios + los de la clase madre (super-clase)


        //Metodos de la clase madre, cuando el constructor de la subclase no tiene ingresado el atributo
        //de la superclase
//        a1.setSeats(4);
//        a1.getSeats();

    }
}
