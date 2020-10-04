package ar.com.ada.online.second.instance;

public class TieStarFighter {
    String model;
    Integer energy;

    TieStarFighter() { //constructor vacio es creado por java si y solo si no hay otros contrtuctores
        // se recomeinda crearlo para tenerlo disponible
    }

    TieStarFighter(String model) { //constructor con un solo parametro, firma
        this.model = model;

    }

    TieStarFighter(Integer energy) {//constructor con un solo parametro, diferente firma
        this.energy = energy;
    }

    TieStarFighter(String model, Integer energy) {//constructor con dos parametros, diferente firma
        this.model = model;
        this.energy = energy;

    }

    TieStarFighter(Integer energy, String model) {//constructor con dos parametros, diferente firma
        this.energy = energy;
        this.model = model;

    }

// son todos los constructores que se pueden crear
}
