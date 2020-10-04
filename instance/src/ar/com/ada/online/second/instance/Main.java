package ar.com.ada.online.second.instance;

public class Main {

    //private static String model;
    // private static String energy;

    public static void main(String[] args) {
        System.out.println("Instance");
        XWingStarfighter ship1 = new XWingStarfighter();

        ship1.model = "T-75";
        ship1.maxAcceleration = 22;
        ship1.shootLaser();


        //esta variable toma la referencia en memoria
        //de la instancia creada en ship1
        XWingStarfighter shipRef1 = ship1;//es la copia de la referencia
        shipRef1.shootLaser();// cuando ejecute el metodo mostrara el modelo "T-75"(ship1)
        shipRef1.model = "T-65";//cambie el valor de SHIP1 a partir de ref1
        shipRef1.maxAcceleration = 32;//cambie el valor de SHIP1 a partir de ref1
        shipRef1.shootLaser();


        XWingStarfighter ship2 = new XWingStarfighter();

        ship2.model = "T-65";
        ship2.maxAcceleration = 16;
        ship2.shootLaser();

//        TieStarFighter enemyShip1 = new TieStarFighter();//llame al constructor vacio
//        TieStarFighter enemyShip2 = new TieStarFighter(model:"Z-23");
//        TieStarFighter enemyShip3 = new TieStarFighter(energy:22 );
//        TieStarFighter enemyShip4 = new TieStarFighter(model:"Z-23", energy:22);
//        TieStarFighter enemyShip5 = new TieStarFighter(energy:22, model:"Z-23");

        //System.out.println("");
    }
}
