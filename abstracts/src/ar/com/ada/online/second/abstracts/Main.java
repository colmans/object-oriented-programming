package ar.com.ada.online.second.abstracts;

import ar.com.ada.online.second.abstracts.subclass.ElectricalVehicle;
import ar.com.ada.online.second.abstracts.subclass.SportVehicle;
import ar.com.ada.online.second.abstracts.subclass.Truck;
import ar.com.ada.online.second.abstracts.superclass.Vehicle;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Vehicle> valList = new ArrayList<Vehicle>();

        //con las listas piede seguir creciendo en cantidad de objetos
        //arrayList es un contenedor de objetos

        //vehiculos electriculos
        valList.add(new ElectricalVehicle("Ford", "Focus", 2000, 650));
        valList.add(new ElectricalVehicle("Ford", "Equis", 2020, 600));
        valList.add(new ElectricalVehicle("Ford", "Fiesta", 1999, 500));
        valList.add(new ElectricalVehicle("Ford", "Linus", 2005, 400));

        //vehiculos deportivos
        valList.add(new SportVehicle("Fiat", "Uno", 2001, 200));
        valList.add(new SportVehicle("Fiat", "Dos", 2010, 400));
        valList.add(new SportVehicle("Fiat", "Tres", 2020, 500));
        valList.add(new SportVehicle("Fiat", "Cuatro", 1982, 600));

        //camiones
        valList.add(new Truck("Scannia", "Mountain", 2020, 50));
        valList.add(new Truck("Scannia", "Winter", 1990, 200));
        valList.add(new Truck("Scannia", "Road", 2015, 100));
        valList.add(new Truck("Scannia", "Spirits", 2001, 98));

        for (Vehicle vehicle : valList) { //recorre cada elemento del arraylist gaurdado en valList y lo guarda en vehicle
            System.out.println();
            System.out.println(vehicle.technicalSheet());

        }
    }
}
