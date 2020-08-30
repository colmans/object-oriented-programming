package ar.com.ada.online.second.objectexercisetwo;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        // Nota: El usuario solo debe ingresar los datos para el nombre del ítem, el precio y la
        //fecha de vencimiento.
        // El impuesto y el total a pagar se deben calcular en los métodos
        //de la clase.


        //clase para ingresar datos por teclado
        Scanner keyboard = new Scanner(System.in);
        //DECLARO LA CLASE SIMPLEDATEFORMAT, con el mismo formato que le pido al usuario
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        //se crea el objeto tipo Item, DONDE SE VAN A GUARDAR LOS DATOS QUE NGRESA EL USUARIO
        Item product = new Item();

        //COMIENZO A SOLICITAR LOS DATOS AL USUARIO
        System.out.println("Ingrese nombre del item: ");
        product.name = keyboard.nextLine();

        System.out.println("Ingrese el precio: ");
        product.price = keyboard.nextDouble();
        // product.price = Double.valueOf(keyboard.next()); el valueOf "envuelve" el string que ingresa el usuasrio
        //y lo devuelve como double para que se gaurde en product.price

        System.out.print("Ingrese fecha de vencimiento siguiendo el formato predefinido: dd-MM-yyyy\n");
        //declaro la CLASE SimpleDateFormat dateformat = new SimpleDateFormat();
        String date = keyboard.next();
        product.expirationDate = dateFormat.parse(date);//parse tira un error: es
        //product.expirationDate = dateFormat.parse(keyboard.next());//

        //ya tengo el nombre , el precio y la fecha de expiracion
        //utilizar el metodo para para calcular el impuesto
        product.calculateTax();
        //hacer la estructura de decision para saber si se puede vender:vencido o no
        if (product.cantItBeSold()) {
            Double totalToPay = product.getTotalToPay();//el metodo getTotalToPay retorna el resultado y lo guardo en una variable
            System.out.printf(
                    "- Nombre: %s\n- Precio: %.2f\n- Impuesto: %.2f\n- Total a Pagar: %.2f",
                    product.name,
                    product.price,
                    product.tax,
                    totalToPay
            );

        } else {
            System.out.println("Este Ítem no está habilitado para la venta");
        }
    }
}


