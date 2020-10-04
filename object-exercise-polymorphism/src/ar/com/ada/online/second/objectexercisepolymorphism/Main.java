package ar.com.ada.online.second.objectexercisepolymorphism;

import ar.com.ada.online.second.objectexercisepolymorphism.subclass.ElectricalVehicle;
import ar.com.ada.online.second.objectexercisepolymorphism.subclass.SportVehicle;
import ar.com.ada.online.second.objectexercisepolymorphism.subclass.Truck;
import ar.com.ada.online.second.objectexercisepolymorphism.superclass.Vehicle;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Vehicle v1 = new Vehicle("Ford","Partner", 2020);
//        System.out.println("El vehiculo tiene:\n" + v1.technicalSheet());
//        Vehicle e1 = new ElectricalVehicle("Fiat","Fiorino",2020,25);
//        System.out.println("El vehiculo tiene:\n" + e1.technicalSheet());
//        Vehicle s1 = new SportVehicle("Citroen","Cactus",2020 , 301);
//        System.out.println("El vehiculo tiene:\n" + s1.technicalSheet());
//        Vehicle t1 = new Truck("Scannia","S-100",2020 ,101);
//        System.out.println("El vehiculo tiene:\n" + t1.technicalSheet());

        Vehicle[] v = {
                //VEHICULOS ELECTRICOS
                new ElectricalVehicle("Ford", "Focus", 2000, 650),
                new ElectricalVehicle("Ford", "Equis", 2020, 600),
                new ElectricalVehicle("Ford", "Fiesta", 1999, 500),
                new ElectricalVehicle("Ford", "Linus", 2005, 400),
                //VEHICULOS DEPORTIVOS
                new SportVehicle("Fiat", "Uno", 2001, 200),
                new SportVehicle("Fiat", "Dos", 1980, 400),
                new SportVehicle("Fiat", "Tres", 2018, 560),
                new SportVehicle("Fiat", "Cuatro", 1975, 700),
                //CAMIONES
                new Truck("Scannia", "Mountain", 2020, 50),
                new Truck("Scannia", "Road", 1998, 60),
                new Truck("Scannia", "Oasis", 2020, 150),
                new Truck("Scannia", "Winter", 2020, 200)

        };

        //recorrer el arrray v

        for (int i = 0; i < v.length; i++) {
            System.out.println("\n");
            System.out.println(v[i].technicalSheet());

        }
    }
}
