package ar.com.ada.online.second.memory;

public class Main {


    public static void main(String[] args) {
        m1();
        m2(10);//se debe poner solo el valor, no escribir b
    }

    public static void m1() {
        int a = 20;
        m2(a);

    }


    public static void m2(int b) {
        boolean c = true;
        m3();
    }

    public static String m3() {
        Account ref = new Account();
        return "HI!";
    }
}
//step into, entra en al funcion y se muestra lo que pasa en ese metodo
//step over, ejecuta el metodo y pasa a la proxima funcion