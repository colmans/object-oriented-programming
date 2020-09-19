package ar.com.ada.online.second.javaaccessibility;

public class MyConstant {
    //para declarar una constante que sea compartida para todas las instancias se usa static, xq pi es universal
    // final porque no se cambia el valor
    public static final Double PI = 3.14159;
    public static Integer counter;

    public static void showPi() {
        System.out.println("El valor de PI = " + PI);

    }
}
