package ar.com.ada.online.second.objectexercisetwo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Nota: El usuario solo debe ingresar los datos para el nombre del ítem, el precio y la
        //fecha de vencimiento. El impuesto y el total a pagar se deben calcular en los métodos
        //de la clase.

        //se crea el objeto tipo Item
        Item product = new Item();
        //clase para ingresar datos por teclado

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese nombre del item: ");
         product.name =keyboard.nextLine();

        System.out.println("Ingrese el precio: ");
        product.price = keyboard.nextDouble();

        /*System.out.println("Ingrese fecha de vencimiento siguiendo el formato predefinido: DD/MM/YYYY\n");
        product.expirationDate = keyboard.nex*/
    }
}

//ejecutar el metodo tax
