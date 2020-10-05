package ar.com.ada.online.second.exerciseparameter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declaro las variables tipo Objeto
        Integer num1;
        Integer num2;

        //Habilito el Scanner para que el usuario ingrese por teclado
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        num1 = keyboard.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        num2 = keyboard.nextInt();

        //instancio clase Result
        Result resultado = new Result();
        Arithmetic calculo = new Arithmetic();

        //calculo la suma
        calculo.sum(resultado, num1, num2);//respetar el orden de los parametros del metodo
        Integer sumaResultado = resultado.getResultSum(); //obtengo resultado de la suma y lo guardo un una variable
        System.out.println("El resultado de la suma es: " + sumaResultado);//muestro lo que guarda variable

        //calculo la resta
        calculo.subtraction(resultado, num1, num2);
        Integer restaResultado = resultado.getResultSubtraction();
        System.out.println("El resultado de la resta es = " + restaResultado);

        //calculo la multiplicacion
        calculo.multiplication(resultado, num1, num2);//utilizo el metodo multiplicacion e ingreso los parametros
        System.out.println("El resultado de la multiplicaion es:" + resultado.getMultiplication());
        //no guardo en una variable el resultado del getmultiplicacion

        //calculo de la division
        calculo.division(resultado, num1, num2);
        System.out.println("El resultado de la division es:" + resultado.getDivision());
        //no guardo en una variable el resultado del getDivision


    }
}
