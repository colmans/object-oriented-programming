package ar.com.ada.online.second.instance;

public class Main {

    public static void main(String[] args) {
        System.out.println("Instance");
        XWingStarfighter ship1 = new XWingStarfighter();

		ship1.model = "T-75";
		ship1.maxAcceleration = 22;
		ship1.shootLaser();


		//esta variable toma la referencia en memoria
        //de la instancia creada en ship1
        XWingStarfighter shipRef1 = ship1;
        shipRef1.shootLaser();
        shipRef1.model = "T-65";//cambie el valor a partir de ref1
        shipRef1.maxAcceleration = 32;
        shipRef1.shootLaser();


        XWingStarfighter ship2 = new XWingStarfighter();

        ship2.model = "T-65";
        ship2.maxAcceleration = 16;
        ship2.shootLaser();



    }
}
