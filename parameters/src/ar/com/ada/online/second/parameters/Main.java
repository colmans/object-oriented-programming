package ar.com.ada.online.second.parameters;

public class Main {

    public static void main(String[] args) {
        m1();
        Person daenerys = new Person(25, "Daenerys");
        System.out.printf("Main: Nombre: %s\n", daenerys.getName());

        changeName(daenerys);
        System.out.printf("Main: Nombre: %s\n", daenerys.getName());


        //daenerys.getName();
        //daenerys.setName("La Khaleesi");//corrige el valor y suplanta "Daenerys" instanciado en Person
    }

    //PASO DE VARIABLES PRIMITIVAS>PASO DE VARIABLES POR VALOR int,string, double, float,
    private static void m1() {
        int a = 20;

        System.out.printf("a antes de llamr n2: %d\n", a);
        m2(a);
        System.out.printf("a despues de llamr n2: %d\n", a);
    }

    private static void m2(int b) {
        System.out.printf("valor de b al iniciar : %d\n", b);
        boolean c = true;
        b++;
        System.out.printf("nuevo valor de b : %d\n", b);


    }

    //PASO DE VARIABLES POR REFERENCIA

    public static void changeName(Person person) {
        System.out.printf("changeName: Nombre Inicial: %s\n", person.getName());
        //caso 1
        // person = new Person( "Drogo", 27);//instancia de un nuevo objeto

        //caso 2

        person.setName("Arya");//estoy cambiando el nombre, no se creo una instancia nueva, modifico
        System.out.printf("changeName: Nombre despues del cambio: %s\n", person.getName());
    }

}
