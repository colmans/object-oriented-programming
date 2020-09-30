package ar.com.ada.online.second.objectexamplepoliformismo;

public class Main {

    public static void main(String[] args) {
        // creo las instancias de cada Clase sin POLIFORMISMO

//        Person p1 = new Person("Diego", "Coelho");
//        Teacher t1 = new Teacher("Carmen", "Lopez", "Sociales", "Derechos Civiles");
//        Student s1 = new Student("Ursula", "Torres", 29774683, "Lic En Sistemas");
//
//        //con los metodos definidos muestra los datos de cada objeto
//        p1.showRecordFile();
//        t1.showRecordFile();
//        s1.showRecordFile();

        //metodo toString
//        System.out.println("p1.toString: " + p1.toString());
//        System.out.println("t1.toString: " + t1.toString());
//        System.out.println("s1.toString: " + s1.toString());

        //creo las instancias de cada clase con POLIFORMISMO

        Person p2 = new Person("Sabrina", "Colman");
        Person t2 = new Teacher("Pablo", "Guersi", "Matematicas", "Estadistica");
        Person s2 = new Student("Valentina", "Torres", 35265398, "Biologa Marina");

        //con los metodos definidos muestra los datos de cada objeto
        p2.showRecordFile();
        t2.showRecordFile();
        s2.showRecordFile();

        //metodo toString
        System.out.println("p2.toString: " + p2.toString());
        System.out.println("t2.toString: " + t2.toString());
        System.out.println("s2.toString: " + s2.toString());


    }
}
